queryByParams
===
* 注释

    select #use("cols")# from t_brand where #use("condition")#
    
updateNoNullById
===
	update t_brand set #use("updateCols")# where id = #id#
	
deleteById
===
	delete from t_brand where id = #id#

cols
===
    id,
    brand_name,
    delete_flag,
    create_time,
    update_time

updateCols
===
    @trim(){
    @if(!isEmpty(brandName)){
    brand_name=#brandName#,
    @}
    @if(!isEmpty(deleteFlag)){
    delete_flag=#deleteFlag#,
    @}
    @if(!isEmpty(createTime)){
    create_time=#createTime#,
    @}
    @if(!isEmpty(updateTime)){
    update_time=#updateTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(id)){
     and id=#id#
    @}
    @if(!isEmpty(brandName)){
     and brand_name=#brandName#
    @}
    @if(!isEmpty(deleteFlag)){
     and delete_flag=#deleteFlag#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
    @if(!isEmpty(updateTime)){
     and update_time=#updateTime#
    @}
