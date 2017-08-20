queryByParams
===
* 注释

    select #use("cols")# from t_family where #use("condition")#
    
updateNoNullById
===
	update t_family set #use("updateCols")# where family_id = #familyId#
	
deleteById
===
	delete from t_family where family_id = #familyId#

cols
===
    family_id,
    relation_id,
    family_code,
    delete_flag,
    create_time,
    update_time

updateCols
===
    @trim(){
    @if(!isEmpty(relationId)){
    relation_id=#relationId#,
    @}
    @if(!isEmpty(familyCode)){
    family_code=#familyCode#,
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
    @if(!isEmpty(familyId)){
     and family_id=#familyId#
    @}
    @if(!isEmpty(relationId)){
     and relation_id=#relationId#
    @}
    @if(!isEmpty(familyCode)){
     and family_code=#familyCode#
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
