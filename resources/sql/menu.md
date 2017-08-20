queryByParams
===
* 注释

    select #use("cols")# from menu where #use("condition")#
    
updateNoNullById
===
	update menu set #use("updateCols")# where MENU_ID = #menuId#
	
deleteById
===
	delete from menu where MENU_ID = #menuId#

cols
===
    MENU_ID,
    FID,
    MENU_NAME,
    PATH,
    ORDERNUM

updateCols
===
    @trim(){
    @if(!isEmpty(fid)){
    FID=#fid#,
    @}
    @if(!isEmpty(menuName)){
    MENU_NAME=#menuName#,
    @}
    @if(!isEmpty(path)){
    PATH=#path#,
    @}
    @if(!isEmpty(ordernum)){
    ORDERNUM=#ordernum#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(menuId)){
     and MENU_ID=#menuId#
    @}
    @if(!isEmpty(fid)){
     and FID=#fid#
    @}
    @if(!isEmpty(menuName)){
     and MENU_NAME=#menuName#
    @}
    @if(!isEmpty(path)){
     and PATH=#path#
    @}
    @if(!isEmpty(ordernum)){
     and ORDERNUM=#ordernum#
    @}
