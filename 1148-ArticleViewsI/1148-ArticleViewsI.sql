-- Last updated: 9/12/2026, 2:18:08 PM
# Write your MySQL query statement below
select DISTINCT author_id as id from Views where  author_id = viewer_id ORDER BY author_id;