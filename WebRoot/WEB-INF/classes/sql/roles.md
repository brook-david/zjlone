queryByParams
===
* 注释

    select #use("cols")# from roles where #use("condition")#
    
updateNoNullById
===
	update roles set #use("updateCols")# where id = #id#
	
deleteById
===
	delete from roles where id = #id#

cols
===
    id,
    role_name,
    description

updateCols
===
    @trim(){
    @if(!isEmpty(roleName)){
    role_name=#roleName#,
    @}
    @if(!isEmpty(description)){
    description=#description#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(id)){
     and id=#id#
    @}
    @if(!isEmpty(roleName)){
     and role_name=#roleName#
    @}
    @if(!isEmpty(description)){
     and description=#description#
    @}
