package cn.asghoul.controller;

public class AddressController {

    @Autowired
    AddressService addressService;

    @ResponseBody
    @RequestMapping( value = "selectAddress")
    public List<Address> selectAddress(long addressId){
        List<Address> address=addressService.selectAddress(addressId);
        return address;
    }
}
