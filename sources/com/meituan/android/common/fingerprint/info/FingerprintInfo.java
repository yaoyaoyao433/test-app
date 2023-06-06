package com.meituan.android.common.fingerprint.info;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.fingerprint.utils.InfoGetter;
import com.meituan.android.common.fingerprint.utils.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FingerprintInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("A32")
    public FingerItem<List<AccelerometerInfo>> accelerometerInfoList;
    @SerializedName("A38")
    public FingerItem<Integer> appCount;
    @SerializedName("A14")
    public FingerItem<String> appDection;
    @SerializedName("A53")
    public FingerItem<String> appVersion;
    @SerializedName("A23")
    public FingerItem<String> basebandVersion;
    @SerializedName("A16")
    public FingerItem<Float> batteryLevel;
    @SerializedName("A21")
    public FingerItem<String> batteryState;
    @SerializedName("A29")
    public FingerItem<Long> bootTime;
    @SerializedName("A10")
    public FingerItem<String> brand;
    @SerializedName("A48")
    public FingerItem<String> buildFingerPrint;
    @SerializedName("A8")
    public FingerItem<String> buildNnumber;
    @SerializedName("A12")
    public FingerItem<String> buildSerial;
    @SerializedName("A51")
    public FingerItem<String> business;
    @SerializedName("A25")
    public FingerItem<List<CellInfo>> cellInfoList;
    @SerializedName("A56")
    public FingerItem<String> ch;
    @SerializedName("A33")
    public FingerItem<Integer> cpuCore;
    @SerializedName("A20")
    public FingerItem<String> cpuFrequency;
    @SerializedName("A4")
    public FingerItem<String> cpuStyle;
    @SerializedName("A18")
    public FingerItem<String> deviceModel;
    @SerializedName("A26")
    public FingerItem<String> devicePixels;
    @SerializedName("A19")
    public FingerItem<Integer> dpi;
    @SerializedName("A52")
    public FingerItem<String> dpid;
    @SerializedName("A54")
    public FingerItem<String> fingerVersion;
    @SerializedName("A40")
    public FingerItem<Long> firstLaunchTime;
    @SerializedName("A7")
    public FingerItem<String> iccid;
    @SerializedName("A35")
    public FingerItem<HashInfoWithNumber> imageHashList;
    @SerializedName("A24")
    public FingerItem<String> imei;
    @SerializedName("A34")
    public FingerItem<String> imsi;
    @SerializedName("A41")
    public FingerItem<Long> installTime;
    @SerializedName("A3")
    public FingerItem<String> kernelVersion;
    @SerializedName("A28")
    public FingerItem<Long> localTime;
    @SerializedName("A57")
    public FingerItem<String> localizers;
    @SerializedName("A36")
    public FingerItem<LocationInfo> location;
    @SerializedName("A42")
    public FingerItem<Integer> locstatus;
    @SerializedName("A9")
    public FingerItem<String> macAddress;
    @SerializedName("A55")
    public FingerItem<String> magic;
    @SerializedName("A1")
    public FingerItem<String> medium;
    @SerializedName("A30")
    public FingerItem<HashInfoWithNumber> musicHash;
    @SerializedName("A11")
    public FingerItem<String> network;
    @SerializedName("A15")
    public FingerItem<String> networkOperator;
    @SerializedName("A37")
    public FingerItem<String> nonSystemApp10;
    @SerializedName("A22")
    public FingerItem<String> os;
    @SerializedName("A13")
    public FingerItem<String> phoneNumber;
    @SerializedName("A43")
    public FingerItem<String> prop;
    @SerializedName("A5")
    public FingerItem<String> pushToken;
    @SerializedName("A44")
    public FingerItem<Integer> roam;
    @SerializedName("A6")
    public FingerItem<Integer> root;
    @SerializedName("A2")
    public FingerItem<Long> serverTime;
    @SerializedName("A45")
    public FingerItem<Integer> simstate;
    @SerializedName("A49")
    public FingerItem<String> source;
    @SerializedName("A46")
    public FingerItem<String> storage;
    @SerializedName("A39")
    public FingerItem<String> systemApp10;
    @SerializedName("A27")
    public FingerItem<Float> systemVolume;
    @SerializedName("A50")
    public FingerItem<String> uuid;
    @SerializedName("A47")
    public FingerItem<String> wifiIp;
    @SerializedName("A31")
    private FingerItem<List<ConnectWifiInfo>> wifiMacAddress;
    @SerializedName("A17")
    public FingerItem<List<WifiMacInfo>> wifimaclist;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class FingerItem<T> implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public T data;
        public boolean success = false;
        public String reason = "";
    }

    public void setCh(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f417e296566e26e837abe15772ef42ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f417e296566e26e837abe15772ef42ef");
        } else {
            this.ch = getFingerItem(infoGetter);
        }
    }

    public void setMedium(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb82f609042a8d4a435dfd3f6a99051f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb82f609042a8d4a435dfd3f6a99051f");
        } else {
            this.medium = getFingerItem(infoGetter);
        }
    }

    public void setServerTime(InfoGetter<Long> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43c04ced8a3f54a64e0d060cb41c8740", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43c04ced8a3f54a64e0d060cb41c8740");
        } else {
            this.serverTime = getFingerItem(infoGetter);
        }
    }

    public void setKernelVersion(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9acb82fd02bab33d7bc7d1073a42966", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9acb82fd02bab33d7bc7d1073a42966");
        } else {
            this.kernelVersion = getFingerItem(infoGetter);
        }
    }

    public void setCpuStyle(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "407ace4d5a9cad055510040fa46d44d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "407ace4d5a9cad055510040fa46d44d2");
        } else {
            this.cpuStyle = getFingerItem(infoGetter);
        }
    }

    public void setPushToken(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c926b51fecc941f6173403358d95dd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c926b51fecc941f6173403358d95dd3");
        } else {
            this.pushToken = getFingerItem(infoGetter);
        }
    }

    public void setRoot(InfoGetter<Integer> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1da48cc2b61a8dfd0b6b00ac6f165c7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1da48cc2b61a8dfd0b6b00ac6f165c7c");
        } else {
            this.root = getFingerItem(infoGetter);
        }
    }

    public void setIccid(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47059227f5758c0f03c504b273a13f4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47059227f5758c0f03c504b273a13f4d");
        } else {
            this.iccid = getFingerItem(infoGetter);
        }
    }

    public void setBuildNnumber(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb618fd31686cec41975f15d4542274d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb618fd31686cec41975f15d4542274d");
        } else {
            this.buildNnumber = getFingerItem(infoGetter);
        }
    }

    public void setMacAddress(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0917f734395be63d20ff0bc0bb19646d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0917f734395be63d20ff0bc0bb19646d");
        } else {
            this.macAddress = getFingerItem(infoGetter);
        }
    }

    public void setBrand(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d38cf578ad4375d3254469ed827c9abd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d38cf578ad4375d3254469ed827c9abd");
        } else {
            this.brand = getFingerItem(infoGetter);
        }
    }

    public void setNetwork(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb4112adb466368bedc2cc443d0c4058", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb4112adb466368bedc2cc443d0c4058");
        } else {
            this.network = getFingerItem(infoGetter);
        }
    }

    public void setBuildSerial(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8471cee9848fa9df5f802912bb63c078", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8471cee9848fa9df5f802912bb63c078");
        } else {
            this.buildSerial = getFingerItem(infoGetter);
        }
    }

    public void setPhoneNumber(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfbb8f18569efc5b408ebe7f1c758344", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfbb8f18569efc5b408ebe7f1c758344");
        } else {
            this.phoneNumber = getFingerItem(infoGetter);
        }
    }

    public void setAppDection(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9800277d6b3745b6a9e86b360fa9559", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9800277d6b3745b6a9e86b360fa9559");
        } else {
            this.appDection = getFingerItem(infoGetter);
        }
    }

    public void setNetworkOperator(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e92c063933d0b93d1b20a6cff6311158", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e92c063933d0b93d1b20a6cff6311158");
        } else {
            this.networkOperator = getFingerItem(infoGetter);
        }
    }

    public void setBatteryLevel(InfoGetter<Float> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c467925aaf53bec35a654b9d63190582", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c467925aaf53bec35a654b9d63190582");
        } else {
            this.batteryLevel = getFingerItem(infoGetter);
        }
    }

    public void setWifimaclist(InfoGetter<List<WifiMacInfo>> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a277494c954068d671b83cac9a460a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a277494c954068d671b83cac9a460a6");
        } else {
            this.wifimaclist = getFingerItem(infoGetter);
        }
    }

    public void setDeviceModel(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e645a1924a20fafcbf24e2cdcc5e5d61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e645a1924a20fafcbf24e2cdcc5e5d61");
        } else {
            this.deviceModel = getFingerItem(infoGetter);
        }
    }

    public void setDpi(InfoGetter<Integer> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43b89d89448eeae46b003227e3f16cbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43b89d89448eeae46b003227e3f16cbc");
        } else {
            this.dpi = getFingerItem(infoGetter);
        }
    }

    public void setCpuFrequency(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a3c85c5d6b6ee162941d98619a75980", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a3c85c5d6b6ee162941d98619a75980");
        } else {
            this.cpuFrequency = getFingerItem(infoGetter);
        }
    }

    public void setBatteryState(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e23f02b484887aff36b4f59415809ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e23f02b484887aff36b4f59415809ba");
        } else {
            this.batteryState = getFingerItem(infoGetter);
        }
    }

    public void setOs(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bad56fb166bdab5b140cf5aa47dabc74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bad56fb166bdab5b140cf5aa47dabc74");
        } else {
            this.os = getFingerItem(infoGetter);
        }
    }

    public void setBasebandVersion(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80212770f13d4b77c371a0af1aca6252", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80212770f13d4b77c371a0af1aca6252");
        } else {
            this.basebandVersion = getFingerItem(infoGetter);
        }
    }

    public void setImei(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "906a67983e3180f29fcd73cf3dc5c3df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "906a67983e3180f29fcd73cf3dc5c3df");
        } else {
            this.imei = getFingerItem(infoGetter);
        }
    }

    public void setCellInfoList(InfoGetter<List<CellInfo>> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b497bc0a101ecf45e151c6f7bf53694d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b497bc0a101ecf45e151c6f7bf53694d");
        } else {
            this.cellInfoList = getFingerItem(infoGetter);
        }
    }

    public void setDevicePixels(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d9a977c148bb87f209789222f9bab08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d9a977c148bb87f209789222f9bab08");
        } else {
            this.devicePixels = getFingerItem(infoGetter);
        }
    }

    public void setSystemVolume(InfoGetter<Float> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7189342db09eee590ce9c9113fc83fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7189342db09eee590ce9c9113fc83fe");
        } else {
            this.systemVolume = getFingerItem(infoGetter);
        }
    }

    public void setLocalTime(InfoGetter<Long> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3868d6a05747bac1414098e98673607f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3868d6a05747bac1414098e98673607f");
        } else {
            this.localTime = getFingerItem(infoGetter);
        }
    }

    public void setBootTime(InfoGetter<Long> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b65e6b255b7e4c28cd63bcb75b5027f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b65e6b255b7e4c28cd63bcb75b5027f0");
        } else {
            this.bootTime = getFingerItem(infoGetter);
        }
    }

    public void setMusicHash(InfoGetter<HashInfoWithNumber> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "052e2d57463c4ecdc1b8d895c7b00017", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "052e2d57463c4ecdc1b8d895c7b00017");
        } else {
            this.musicHash = getFingerItem(infoGetter);
        }
    }

    public void setWifiMacAddress(InfoGetter<List<ConnectWifiInfo>> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4606d7abcf27a722a0d779010b07e01d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4606d7abcf27a722a0d779010b07e01d");
        } else {
            this.wifiMacAddress = getFingerItem(infoGetter);
        }
    }

    public void setAccelerometerInfoList(InfoGetter<List<AccelerometerInfo>> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "662e346d11e66410dad5fae950452d1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "662e346d11e66410dad5fae950452d1c");
        } else {
            this.accelerometerInfoList = getFingerItem(infoGetter);
        }
    }

    public void setCpuCore(InfoGetter<Integer> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1e7c54eb5cbc28eed4cbe3d0abbd859", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1e7c54eb5cbc28eed4cbe3d0abbd859");
        } else {
            this.cpuCore = getFingerItem(infoGetter);
        }
    }

    public void setImsi(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07c4a7bb16eff7f6af62963e5644ad57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07c4a7bb16eff7f6af62963e5644ad57");
        } else {
            this.imsi = getFingerItem(infoGetter);
        }
    }

    public void setImageHashList(InfoGetter<HashInfoWithNumber> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bce8243504aa8960500217e2f861c37f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bce8243504aa8960500217e2f861c37f");
        } else {
            this.imageHashList = getFingerItem(infoGetter);
        }
    }

    public void setLocation(InfoGetter<LocationInfo> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed27c2ea676e36b7e65315b44f146550", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed27c2ea676e36b7e65315b44f146550");
        } else {
            this.location = getFingerItem(infoGetter);
        }
    }

    public void setNonSystemApp10(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c89175cca1329332f9425c83f0f52d53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c89175cca1329332f9425c83f0f52d53");
        } else {
            this.nonSystemApp10 = getFingerItem(infoGetter);
        }
    }

    public void setAppCount(InfoGetter<Integer> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e549d590c1361be61cadc5e99706a632", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e549d590c1361be61cadc5e99706a632");
        } else {
            this.appCount = getFingerItem(infoGetter);
        }
    }

    public void setSystemApp10(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ff2cadd73e86a4192fceace2431570b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ff2cadd73e86a4192fceace2431570b");
        } else {
            this.systemApp10 = getFingerItem(infoGetter);
        }
    }

    public void setFirstLaunchTime(InfoGetter<Long> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7cea0ab3bef45f8304a3c8bacd5412d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7cea0ab3bef45f8304a3c8bacd5412d");
        } else {
            this.firstLaunchTime = getFingerItem(infoGetter);
        }
    }

    public void setInstallTime(InfoGetter<Long> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48e25d97ee454d87626c6f735d724ab0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48e25d97ee454d87626c6f735d724ab0");
        } else {
            this.installTime = getFingerItem(infoGetter);
        }
    }

    public void setLocstatus(InfoGetter<Integer> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5713b10be1091f44f2f9169cecbeac2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5713b10be1091f44f2f9169cecbeac2c");
        } else {
            this.locstatus = getFingerItem(infoGetter);
        }
    }

    public void setProp(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddd860ff0be507305ca8533c432ef182", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddd860ff0be507305ca8533c432ef182");
        } else {
            this.prop = getFingerItem(infoGetter);
        }
    }

    public void setRoam(InfoGetter<Integer> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14bff3cc59cd8e86e91f40bfb2566578", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14bff3cc59cd8e86e91f40bfb2566578");
        } else {
            this.roam = getFingerItem(infoGetter);
        }
    }

    public void setSimstate(InfoGetter<Integer> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28735bac4de4b9c4f09e4ac1f316cb05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28735bac4de4b9c4f09e4ac1f316cb05");
        } else {
            this.simstate = getFingerItem(infoGetter);
        }
    }

    public void setStorage(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8e8f8b328136c9f53d10e998e6e4fb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8e8f8b328136c9f53d10e998e6e4fb4");
        } else {
            this.storage = getFingerItem(infoGetter);
        }
    }

    public void setWifiIp(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dc3c4f46ae3e23939671532f5df4567", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dc3c4f46ae3e23939671532f5df4567");
        } else {
            this.wifiIp = getFingerItem(infoGetter);
        }
    }

    public void setBuildFingerPrint(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c3917302eb40e479330ecffdc680fe9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c3917302eb40e479330ecffdc680fe9");
        } else {
            this.buildFingerPrint = getFingerItem(infoGetter);
        }
    }

    public void setSource(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "098e6b8d3d9ca01a233b98dd7315fb2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "098e6b8d3d9ca01a233b98dd7315fb2d");
        } else {
            this.source = getFingerItem(infoGetter);
        }
    }

    public void setUuid(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e3464048d7296204092a1205151b9a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e3464048d7296204092a1205151b9a8");
        } else {
            this.uuid = getFingerItem(infoGetter);
        }
    }

    public void setBusiness(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b46570e6ea73e785010809ae0385990", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b46570e6ea73e785010809ae0385990");
        } else {
            this.business = getFingerItem(infoGetter);
        }
    }

    public void setDpid(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5138fe5db8217402c1ac090f090cba6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5138fe5db8217402c1ac090f090cba6");
        } else {
            this.dpid = getFingerItem(infoGetter);
        }
    }

    public void setAppVersion(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a24f48f5a2ca2e5e16c2abfcd39a6d74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a24f48f5a2ca2e5e16c2abfcd39a6d74");
        } else {
            this.appVersion = getFingerItem(infoGetter);
        }
    }

    public void setFingerVersion(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c70667682663d84d5c9fa3b9fcc46d99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c70667682663d84d5c9fa3b9fcc46d99");
        } else {
            this.fingerVersion = getFingerItem(infoGetter);
        }
    }

    public void setMagic(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8892486f7a5a78a6535c6d271cbccc27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8892486f7a5a78a6535c6d271cbccc27");
        } else {
            this.magic = getFingerItem(infoGetter);
        }
    }

    public void setLocalizers(InfoGetter<String> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f20941b1c72138e30bd8e5f2e570962", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f20941b1c72138e30bd8e5f2e570962");
        } else {
            this.localizers = getFingerItem(infoGetter);
        }
    }

    private static <T> FingerItem<T> getFingerItem(InfoGetter<T> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a3b62d2787e844b60b2a8d2004540d1", 6917529027641081856L)) {
            return (FingerItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a3b62d2787e844b60b2a8d2004540d1");
        }
        FingerItem<T> fingerItem = new FingerItem<>();
        try {
            fingerItem.data = infoGetter.get();
            fingerItem.success = true;
        } catch (Throwable th) {
            fingerItem.success = false;
            fingerItem.reason = getReasonString(th);
            StringUtils.setErrorLogan(th);
        }
        return fingerItem;
    }

    private static String getReasonString(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "28b4e4fa1d147f5122249d6ed4a3d500", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "28b4e4fa1d147f5122249d6ed4a3d500");
        }
        if (th != null) {
            try {
                StackTraceElement[] stackTrace = th.getStackTrace();
                if (stackTrace.length > 0) {
                    str = stackTrace[0].toString();
                }
            } catch (Throwable unused) {
                StringUtils.setErrorLogan(th);
                return "MtFingerCrash: unKnown";
            }
        }
        return "MtFingerCrash:" + str;
    }

    public static <T> FingerItem<T> getFingerItemForJUnit(InfoGetter<T> infoGetter) {
        Object[] objArr = {infoGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57d002d543efcb242669b5eebabd847f", 6917529027641081856L) ? (FingerItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57d002d543efcb242669b5eebabd847f") : getFingerItem(infoGetter);
    }
}
