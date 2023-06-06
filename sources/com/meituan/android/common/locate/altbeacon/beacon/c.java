package com.meituan.android.common.locate.altbeacon.beacon;

import android.annotation.TargetApi;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.os.ParcelUuid;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
@TargetApi(21)
/* loaded from: classes2.dex */
public class c implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MtBluetoothAdapter a;
    private BluetoothLeAdvertiser b;
    private int c;
    private int d;
    private a e;
    private BeaconParser f;
    private boolean g;
    private AdvertiseCallback h;
    private boolean i;

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d77e6256f41601569299acc4bd92874", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d77e6256f41601569299acc4bd92874");
            return;
        }
        this.c = 1;
        this.d = 3;
        this.i = false;
        this.f = new BeaconParser().setBeaconLayout("m:2-3=0215,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25");
        this.a = Privacy.createBluetoothAdapter("pt-c140c5921e4d3392");
        if (this.a == null) {
            com.meituan.android.common.locate.altbeacon.beacon.util.c.c("BeaconTransmitter", "Failed to get MtBluetoothAdapter", new Object[0]);
            return;
        }
        this.b = this.a.getBluetoothLeAdvertiser();
        com.meituan.android.common.locate.altbeacon.beacon.util.c.a("BeaconTransmitter", "new BeaconTransmitter constructed.  mbluetoothLeAdvertiser is %s", this.b);
    }

    private static ParcelUuid a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3abf572e3b6702282597514a4bbaabb", RobustBitConfig.DEFAULT_VALUE)) {
            return (ParcelUuid) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3abf572e3b6702282597514a4bbaabb");
        }
        ParcelUuid fromString = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
        if (bArr != null) {
            int length = bArr.length;
            if (length != 2 && length != 4 && length != 16) {
                throw new IllegalArgumentException("uuidBytes length invalid - " + length);
            } else if (length != 16) {
                return new ParcelUuid(new UUID(fromString.getUuid().getMostSignificantBits() + ((length == 2 ? (bArr[0] & 255) + ((bArr[1] & 255) << 8) : ((bArr[3] & 255) << 24) + (((bArr[0] & 255) + ((bArr[1] & 255) << 8)) + ((bArr[2] & 255) << 16))) << 32), fromString.getUuid().getLeastSignificantBits()));
            } else {
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
            }
        }
        throw new IllegalArgumentException("uuidBytes cannot be null");
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2eaefecaf707dbc303a6d26eabbbc38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2eaefecaf707dbc303a6d26eabbbc38");
        } else if (this.e == null) {
            throw new NullPointerException("Beacon cannot be null.  Set beacon before starting advertising");
        } else {
            int a = this.e.a();
            int intValue = this.f.getServiceUuid() != null ? this.f.getServiceUuid().intValue() : -1;
            if (this.f == null) {
                throw new NullPointerException("You must supply a BeaconParser instance to BeaconTransmitter.");
            }
            byte[] beaconAdvertisementData = this.f.getBeaconAdvertisementData(this.e);
            String str = "";
            for (int i = 0; i < beaconAdvertisementData.length; i++) {
                str = (str + String.format("%02X", Byte.valueOf(beaconAdvertisementData[i]))) + StringUtil.SPACE;
            }
            Object[] objArr2 = new Object[5];
            objArr2[0] = this.e.b();
            objArr2[1] = this.e.f().size() > 1 ? this.e.c() : "";
            objArr2[2] = this.e.f().size() > 2 ? this.e.d() : "";
            objArr2[3] = str;
            objArr2[4] = Integer.valueOf(beaconAdvertisementData.length);
            com.meituan.android.common.locate.altbeacon.beacon.util.c.a("BeaconTransmitter", "Starting advertising with ID1: %s ID2: %s ID3: %s and data: %s of size %s", objArr2);
            try {
                AdvertiseData.Builder builder = new AdvertiseData.Builder();
                if (intValue > 0) {
                    ParcelUuid a2 = a(new byte[]{(byte) (intValue & 255), (byte) ((intValue >> 8) & 255)});
                    builder.addServiceData(a2, beaconAdvertisementData);
                    builder.addServiceUuid(a2);
                    builder.setIncludeTxPowerLevel(false);
                    builder.setIncludeDeviceName(false);
                } else {
                    builder.addManufacturerData(a, beaconAdvertisementData);
                }
                AdvertiseSettings.Builder builder2 = new AdvertiseSettings.Builder();
                builder2.setAdvertiseMode(this.c);
                builder2.setTxPowerLevel(this.d);
                builder2.setConnectable(this.i);
                this.b.startAdvertising(builder2.build(), builder.build(), d());
                com.meituan.android.common.locate.altbeacon.beacon.util.c.a("BeaconTransmitter", "Started advertisement with callback: %s", d());
            } catch (Exception e) {
                com.meituan.android.common.locate.altbeacon.beacon.util.c.a(e, "BeaconTransmitter", "Cannot start advertising due to exception", new Object[0]);
            }
        }
    }

    private AdvertiseCallback d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da46314acf14ff575ebb6b63454099e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdvertiseCallback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da46314acf14ff575ebb6b63454099e8");
        }
        if (this.h == null) {
            this.h = new AdvertiseCallback() { // from class: com.meituan.android.common.locate.altbeacon.beacon.c.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.bluetooth.le.AdvertiseCallback
                public void onStartFailure(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aacac8245cd931b4dd72481c153161fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aacac8245cd931b4dd72481c153161fe");
                        return;
                    }
                    LogUtils.a("Advertisement start failed, code:" + i);
                    com.meituan.android.common.locate.platform.sniffer.b.b(new c.a(com.meituan.android.common.locate.altbeacon.beacon.util.a.h, "fail"));
                }

                @Override // android.bluetooth.le.AdvertiseCallback
                public void onStartSuccess(AdvertiseSettings advertiseSettings) {
                    Object[] objArr2 = {advertiseSettings};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5a0dc1d083a864f9a63ebd7b99b7baf0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5a0dc1d083a864f9a63ebd7b99b7baf0");
                        return;
                    }
                    LogUtils.a("Advertisement start succeeded.");
                    c.this.g = true;
                    com.meituan.android.common.locate.platform.sniffer.b.a(new c.a(com.meituan.android.common.locate.altbeacon.beacon.util.a.g, "success"));
                }
            };
        }
        return this.h;
    }

    @Override // com.meituan.android.common.locate.altbeacon.beacon.b
    public void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81163b1f2e3a676a326460225da6626a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81163b1f2e3a676a326460225da6626a");
        } else if (this.g) {
        } else {
            this.e = aVar;
            try {
                c();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.meituan.android.common.locate.altbeacon.beacon.b
    public boolean a() {
        return this.g;
    }

    @Override // com.meituan.android.common.locate.altbeacon.beacon.b
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5182dbdbbd25d5c1401f658fd096831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5182dbdbbd25d5c1401f658fd096831");
        } else if (this.g) {
            try {
                this.b.stopAdvertising(d());
            } catch (Exception unused) {
                com.meituan.android.common.locate.altbeacon.beacon.util.c.b("BeaconTransmitter", "Bluetooth is turned off. Transmitter stop call failed.", new Object[0]);
            }
            this.g = false;
        }
    }
}
