queryByParams
===
* 注释

    select #use("cols")# from user_roles where #use("condition")#
    
updateNoNullById
===
	update user_roles set #use("updateCols")# where user_id = #userId#
	
deleteById
===
	delete from user_roles where user_id = #userId#

cols
===
    user_id,
    role_id,
    create_time

updateCols
===
    @trim(){
    @if(!isEmpty(roleId)){
    role_id=#roleId#,
    @}
    @if(!isEmpty(createTime)){
    create_time=#createTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(userId)){
     and user_id=#userId#
    @}
    @if(!isEmpty(roleId)){
     and role_id=#roleId#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
