queryByParams
===
* 注释

    select #use("cols")# from permissions where #use("condition")#
    
updateNoNullById
===
	update permissions set #use("updateCols")# where id = #id#
	
deleteById
===
	delete from permissions where id = #id#

cols
===
    id,
    permission,
    description,
    create_time

updateCols
===
    @trim(){
    @if(!isEmpty(permission)){
    permission=#permission#,
    @}
    @if(!isEmpty(description)){
    description=#description#,
    @}
    @if(!isEmpty(createTime)){
    create_time=#createTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(id)){
     and id=#id#
    @}
    @if(!isEmpty(permission)){
     and permission=#permission#
    @}
    @if(!isEmpty(description)){
     and description=#description#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
