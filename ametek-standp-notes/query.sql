
-- Fetching leased to details
select * from cust_lease cl
join cust c on cl.cust_id = c.cust_id
where cl.owner_cust_id = 8
and cl.stop_dt is null
and c.freeze_dt is null;


-- Fetching lease from customer list
select * from cust_lease cl
join cust c on cl.owner_cust_id = c.cust_id
where cl.cust_id = 21412
union all
select * from cust c where c.cust_id = 274
and exists(
    select 1 from cust_shared cs
    join xtra_parent_acct xpa
    on xpa.cust_id = cs.cust_id_shared
    where cs.cust_id = 21412
)