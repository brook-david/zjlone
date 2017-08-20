queryByParams
===
* 注释

    select #use("cols")# from t_agency where #use("condition")#
    
updateNoNullById
===
	update t_agency set #use("updateCols")# where agency_id = #agencyId#
	
deleteById
===
	delete from t_agency where agency_id = #agencyId#

cols
===
    agency_id,
    agency_name,
    brand_id,
    unit_price,
    province,
    city,
    area,
    address,
    status,
    delete_flag,
    create_time,
    update_time

updateCols
===
    @trim(){
    @if(!isEmpty(agencyName)){
    agency_name=#agencyName#,
    @}
    @if(!isEmpty(brandId)){
    brand_id=#brandId#,
    @}
    @if(!isEmpty(unitPrice)){
    unit_price=#unitPrice#,
    @}
    @if(!isEmpty(province)){
    province=#province#,
    @}
    @if(!isEmpty(city)){
    city=#city#,
    @}
    @if(!isEmpty(area)){
    area=#area#,
    @}
    @if(!isEmpty(address)){
    address=#address#,
    @}
    @if(!isEmpty(status)){
    status=#status#,
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
    @if(!isEmpty(agencyId)){
     and agency_id=#agencyId#
    @}
    @if(!isEmpty(agencyName)){
     and agency_name=#agencyName#
    @}
    @if(!isEmpty(brandId)){
     and brand_id=#brandId#
    @}
    @if(!isEmpty(unitPrice)){
     and unit_price=#unitPrice#
    @}
    @if(!isEmpty(province)){
     and province=#province#
    @}
    @if(!isEmpty(city)){
     and city=#city#
    @}
    @if(!isEmpty(area)){
     and area=#area#
    @}
    @if(!isEmpty(address)){
     and address=#address#
    @}
    @if(!isEmpty(status)){
     and status=#status#
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
