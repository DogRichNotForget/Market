package cn.asghoul.pojo;

/*
 * 地址表：adress
 */
public class Address {


        private long addressId;//地址id
        private long clientId;//用户id
        private String address;//地址
        private String telphone;//收货人电话
        private int defaultAddress;//默认地址状态
        private String name;//收货人姓名

        public long getAddressId() {
            return addressId;
        }

        public void setAddressId(long addressId) {
            this.addressId = addressId;
        }

        public long getClientId() {
            return clientId;
        }

        public void setClientId(long clientId) {
            this.clientId = clientId;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTelphone() {
            return telphone;
        }

        public void setTelphone(String telphone) {
            this.telphone = telphone;
        }

        public int getDefaultAddress() {
            return defaultAddress;
        }

        public void setDefaultAddress(int defaultAddress) {
            this.defaultAddress = defaultAddress;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
