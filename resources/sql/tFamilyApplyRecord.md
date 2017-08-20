queryByParams
===
* 注释

    select #use("cols")# from t_family_apply_record where #use("condition")#
    
updateNoNullById
===
	update t_family_apply_record set #use("updateCols")# where apply_id = #applyId#
	
deleteById
===
	delete from t_family_apply_record where apply_id = #applyId#

cols
===
    apply_id,
    family_id,
    member_id,
    relations,
    apply_time,
    update_time,
    status,
    flag

updateCols
===
    @trim(){
    @if(!isEmpty(familyId)){
    family_id=#familyId#,
    @}
    @if(!isEmpty(memberId)){
    member_id=#memberId#,
    @}
    @if(!isEmpty(relations)){
    relations=#relations#,
    @}
    @if(!isEmpty(applyTime)){
    apply_time=#applyTime#,
    @}
    @if(!isEmpty(updateTime)){
    update_time=#updateTime#,
    @}
    @if(!isEmpty(status)){
    status=#status#,
    @}
    @if(!isEmpty(flag)){
    flag=#flag#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(applyId)){
     and apply_id=#applyId#
    @}
    @if(!isEmpty(familyId)){
     and family_id=#familyId#
    @}
    @if(!isEmpty(memberId)){
     and member_id=#memberId#
    @}
    @if(!isEmpty(relations)){
     and relations=#relations#
    @}
    @if(!isEmpty(applyTime)){
     and apply_time=#applyTime#
    @}
    @if(!isEmpty(updateTime)){
     and update_time=#updateTime#
    @}
    @if(!isEmpty(status)){
     and status=#status#
    @}
    @if(!isEmpty(flag)){
     and flag=#flag#
    @}
