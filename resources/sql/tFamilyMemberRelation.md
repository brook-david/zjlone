queryByParams
===
* 注释

    select #use("cols")# from t_family_member_relation where #use("condition")#
    
updateNoNullById
===
	update t_family_member_relation set #use("updateCols")# where id = #id#
	
deleteById
===
	delete from t_family_member_relation where id = #id#

cols
===
    id,
    family_id,
    member_id,
    relations,
    member_authority,
    jion_time,
    update_time,
    delete_flag

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
    @if(!isEmpty(memberAuthority)){
    member_authority=#memberAuthority#,
    @}
    @if(!isEmpty(jionTime)){
    jion_time=#jionTime#,
    @}
    @if(!isEmpty(updateTime)){
    update_time=#updateTime#,
    @}
    @if(!isEmpty(deleteFlag)){
    delete_flag=#deleteFlag#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(id)){
     and id=#id#
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
    @if(!isEmpty(memberAuthority)){
     and member_authority=#memberAuthority#
    @}
    @if(!isEmpty(jionTime)){
     and jion_time=#jionTime#
    @}
    @if(!isEmpty(updateTime)){
     and update_time=#updateTime#
    @}
    @if(!isEmpty(deleteFlag)){
     and delete_flag=#deleteFlag#
    @}
