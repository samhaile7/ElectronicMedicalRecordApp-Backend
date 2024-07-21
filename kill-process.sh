#!/bin/bash

# This script forcefully terminates the process running on port 8080.
# It uses `lsof` to list open files and the corresponding processes filtered by network connections on port 8080.
# `awk` is used to extract the second column (PID) from the `lsof` output, skipping the first line (header).
# `head -n 1` ensures that only the first PID is selected if multiple processes are found.
# `kill -9` is then used to forcefully terminate the process with the found PID.

kill -9 $(lsof -i :8080 | awk 'NR>1 {print $2}' | head -n 1)