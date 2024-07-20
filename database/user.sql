-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER emrapp_owner
WITH PASSWORD 'postgres1';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO emrapp_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO emrapp_owner;

CREATE USER emrapp_appuser
WITH PASSWORD 'postgres1';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO emrapp_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO emrapp_appuser;
