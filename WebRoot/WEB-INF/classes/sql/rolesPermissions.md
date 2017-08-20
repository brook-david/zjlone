queryByParams
===
* 注释

    select #use("cols")# from roles_permissions where #use("condition")#
    
updateNoNullById
===
	update roles_permissions set #use("updateCols")# where role_id = #roleId#
	
deleteById
===
	delete from roles_permissions where role_id = #roleId#

cols
===
    role_id,
    permission_id,
    create_time

updateCols
===
    @trim(){
    @if(!isEmpty(permissionId)){
    permission_id=#permissionId#,
    @}
    @if(!isEmpty(createTime)){
    create_time=#createTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(roleId)){
     and role_id=#roleId#
    @}
    @if(!isEmpty(permissionId)){
     and permission_id=#permissionId#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
