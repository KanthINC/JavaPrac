## Checking service of haproxy service

**All site names are replaced - with _ (ex: in_blr01)**
**Bydefault it will take all sites**

### How to use this playbook
    
> ansible-playbook -i hosts haproxy.yml

### How to use this playbook to a particular site

> ansible-playbook -i hosts --extra-vars "site=in_blr01"  haproxy.yml
