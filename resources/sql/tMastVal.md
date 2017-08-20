queryByParams
===
* 注释

    select #use("cols")# from t_mast_val where #use("condition")#
    
updateNoNullById
===
	update t_mast_val set #use("updateCols")# where val_id = #valId#
	
deleteById
===
	delete from t_mast_val where val_id = #valId#

cols
===
    val_id,
    mast_id,
    val_name,
    val_code,
    val_value,
    remark,
    delete_flag,
    create_time,
    update_time

updateCols
===
    @trim(){
    @if(!isEmpty(mastId)){
    mast_id=#mastId#,
    @}
    @if(!isEmpty(valName)){
    val_name=#valName#,
    @}
    @if(!isEmpty(valCode)){
    val_code=#valCode#,
    @}
    @if(!isEmpty(valValue)){
    val_value=#valValue#,
    @}
    @if(!isEmpty(remark)){
    remark=#remark#,
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
    @if(!isEmpty(valId)){
     and val_id=#valId#
    @}
    @if(!isEmpty(mastId)){
     and mast_id=#mastId#
    @}
    @if(!isEmpty(valName)){
     and val_name=#valName#
    @}
    @if(!isEmpty(valCode)){
     and val_code=#valCode#
    @}
    @if(!isEmpty(valValue)){
     and val_value=#valValue#
    @}
    @if(!isEmpty(remark)){
     and remark=#remark#
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
