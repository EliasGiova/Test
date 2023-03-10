/*Write the following SQL queries:
1. Name of window with AD_Window_ID = ‘100’*/
/*SELECT name 
FROM ad_window  
WHERE ad_window_id = '100';*/


/*2. Update window with AD_Window_ID = ‘100’ appending ‘--’ to the name of
window with AD_Window_ID = ‘100’*/
/*UPDATE `sqltest`.`ad_window` 
SET `name` = 'elias--' 
WHERE (`ad_window_id` = '100');*/


/*3. List of all tabs in window with AD_Window_ID = ‘100’*/
/*SELECT *
FROM ad_tab
WHERE ad_tab_id = (SELECT ad_window.ad_window_id FROM ad_window WHERE ad_window_id='100';*/
/*or*/
/*SELECT ad_tab.ad_tab_id, ad_tab.name
FROM ad_tab
join ad_window
on ad_window_id = '100';*/


/*4. List of tab name + field name of all tabs in AD_Window_ID = ‘100’ sorted by tab
name and field name*/
/*SELECT ad_tab.name, ad_field.name
FROM ad_tab, ad_field
join ad_window
on ad_window_id='100'
order by ad_tab.name, ad_field.name;*/


/*5. Name and number of tabs of all windows*/
/*SELECT COUNT(*) AS num_tabs, table_name
FROM information_schema.tables
WHERE table_schema = 'sqltest'
GROUP BY table_name;*/


/*6. List of all windows with its number of fields, sorting by number of fields starting
by the windows with a higher number of them*/
/*SELECT w.ad_window_id, w.name, COUNT(*) AS num_fields
FROM ad_tab t
JOIN ad_field f ON t.ad_tab_id = f.ad_field_id
JOIN ad_window w ON t.ad_tab_id = w.ad_window_id
GROUP BY w.ad_window_id, w.name
ORDER BY num_fields DESC;*/


/*7. Windows with more than 5 tabs*/
/*SELECT TABLE_NAME, TABLE_ROWS
FROM information_schema.TABLES
WHERE table_schema = 'sqltest' AND TABLE_ROWS > 5;*/



