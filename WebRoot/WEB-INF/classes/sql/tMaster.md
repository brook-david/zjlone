queryByParams
===
* 注释

    select #use("cols")# from t_master where #use("condition")#
    
updateNoNullById
===
	update t_master set #use("updateCols")# where mast_id = #mastId#
	
deleteById
===
	delete from t_master where mast_id = #mastId#

cols
===
    mast_id,
    mast_name,
    mast_code,
    remarks,
    delete_flag,
    create_time,
    update_time

updateCols
===
    @trim(){
    @if(!isEmpty(mastName)){
    mast_name=#mastName#,
    @}
    @if(!isEmpty(mastCode)){
    mast_code=#mastCode#,
    @}
    @if(!isEmpty(remarks)){
    remarks=#remarks#,
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
    @if(!isEmpty(mastId)){
     and mast_id=#mastId#
    @}
    @if(!isEmpty(mastName)){
     and mast_name=#mastName#
    @}
    @if(!isEmpty(mastCode)){
     and mast_code=#mastCode#
    @}
    @if(!isEmpty(remarks)){
     and remarks=#remarks#
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
