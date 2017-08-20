queryByParams
===
* 注释

    select #use("cols")# from t_sales where #use("condition")#
    
updateNoNullById
===
	update t_sales set #use("updateCols")# where sales_id = #salesId#
	
deleteById
===
	delete from t_sales where sales_id = #salesId#

cols
===
    sales_id,
    agency_id,
    delivery_number,
    price,
    number,
    consignee_phone,
    consignee,
    province,
    city,
    area,
    address,
    remark,
    send_time,
    take_time,
    create_time,
    update_time

updateCols
===
    @trim(){
    @if(!isEmpty(agencyId)){
    agency_id=#agencyId#,
    @}
    @if(!isEmpty(deliveryNumber)){
    delivery_number=#deliveryNumber#,
    @}
    @if(!isEmpty(price)){
    price=#price#,
    @}
    @if(!isEmpty(number)){
    number=#number#,
    @}
    @if(!isEmpty(consigneePhone)){
    consignee_phone=#consigneePhone#,
    @}
    @if(!isEmpty(consignee)){
    consignee=#consignee#,
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
    @if(!isEmpty(remark)){
    remark=#remark#,
    @}
    @if(!isEmpty(sendTime)){
    send_time=#sendTime#,
    @}
    @if(!isEmpty(takeTime)){
    take_time=#takeTime#,
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
    @if(!isEmpty(salesId)){
     and sales_id=#salesId#
    @}
    @if(!isEmpty(agencyId)){
     and agency_id=#agencyId#
    @}
    @if(!isEmpty(deliveryNumber)){
     and delivery_number=#deliveryNumber#
    @}
    @if(!isEmpty(price)){
     and price=#price#
    @}
    @if(!isEmpty(number)){
     and number=#number#
    @}
    @if(!isEmpty(consigneePhone)){
     and consignee_phone=#consigneePhone#
    @}
    @if(!isEmpty(consignee)){
     and consignee=#consignee#
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
    @if(!isEmpty(remark)){
     and remark=#remark#
    @}
    @if(!isEmpty(sendTime)){
     and send_time=#sendTime#
    @}
    @if(!isEmpty(takeTime)){
     and take_time=#takeTime#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
    @if(!isEmpty(updateTime)){
     and update_time=#updateTime#
    @}
