queryByParams
===
* 注释

    select #use("cols")# from users where #use("condition")#
    
updateNoNullById
===
	update users set #use("updateCols")# where id = #id#
	
deleteById
===
	delete from users where id = #id#

cols
===
    id,
    username,
    password,
    status,
    create_time

updateCols
===
    @trim(){
    @if(!isEmpty(username)){
    username=#username#,
    @}
    @if(!isEmpty(password)){
    password=#password#,
    @}
    @if(!isEmpty(status)){
    status=#status#,
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
    @if(!isEmpty(username)){
     and username=#username#
    @}
    @if(!isEmpty(password)){
     and password=#password#
    @}
    @if(!isEmpty(status)){
     and status=#status#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
