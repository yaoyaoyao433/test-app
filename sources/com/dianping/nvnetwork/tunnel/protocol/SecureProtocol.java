package com.dianping.nvnetwork.tunnel.protocol;

import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.agora.rtc.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public abstract class SecureProtocol {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a protocolHelper;

    /* loaded from: classes.dex */
    public enum DataPacketType {
        KEY_SOONEXPIRE_RESPONSE(600),
        KEY_EXPIRED_RESPONSE(601),
        TID_NOEXIST_RESPONSE(602),
        KEY_NOEXIST_RESPONSE(603),
        KEY_TIMEOUT_RESPONSE(604),
        HEARTBEAT(0),
        REGISTER(1),
        DISTRIBUTION_REQUEST(80),
        HTTP_REQUEST(102),
        REFRESH_HEADER(101),
        REGISTER_SUCCESS(2),
        HTTP_RESPONSE(103),
        CREATE_KEY_REQUEST(60),
        CREATE_KEY_RESPONSE(61),
        CREATE_KEY_SUCCESS(62),
        CHANGE_KEY_REQUEST(63),
        CHANGE_KEY_RESPONSE(64),
        CHANGE_KEY_SUCCESS(65),
        RECREATE_KEY_REQUEST(66),
        RECREATE_KEY_RESPONSE(67),
        RECREATE_KEY_SUCCESS(68),
        POST_SHARK_REQEUST(MapConstant.ANIMATION_DURATION_SHORT),
        POST_SHARK_RESPONSE(Constants.ERR_PUBLISH_STREAM_CDN_ERROR),
        PIKE_UP(Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT),
        PIKE_DOWN(Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED),
        PIKE_BINARY_UP(Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR),
        PIKE_BINARY_DOWN(Constants.ERR_PUBLISH_STREAM_NOT_FOUND);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        protected final int type;

        DataPacketType(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f0e532dd9e562174feb74d7e617a8bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f0e532dd9e562174feb74d7e617a8bc");
            } else {
                this.type = i;
            }
        }

        public static boolean isAddSeparator(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1cf3010dbe8f388667f40eedfe44dffe", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1cf3010dbe8f388667f40eedfe44dffe")).booleanValue() : i == HTTP_REQUEST.getType() || i == PIKE_BINARY_UP.getType();
        }

        public static boolean isSecureException(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b6b572656aad936926c2e0d5c8efef5", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b6b572656aad936926c2e0d5c8efef5")).booleanValue() : i == KEY_SOONEXPIRE_RESPONSE.getType() || i == KEY_EXPIRED_RESPONSE.getType() || i == TID_NOEXIST_RESPONSE.getType() || i == KEY_NOEXIST_RESPONSE.getType();
        }

        public static boolean isSecureProtocol(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ee62f4ef4f55fa6ff939b68d01012b0", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ee62f4ef4f55fa6ff939b68d01012b0")).booleanValue() : i == CREATE_KEY_RESPONSE.getType() || i == CHANGE_KEY_RESPONSE.getType() || i == RECREATE_KEY_RESPONSE.getType();
        }

        public static DataPacketType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (DataPacketType) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c8c632c322bd6e1ed80ff3922a04be4", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c8c632c322bd6e1ed80ff3922a04be4") : Enum.valueOf(DataPacketType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static DataPacketType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (DataPacketType[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f5f3e643c226aefc53c29b08690c28c", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f5f3e643c226aefc53c29b08690c28c") : values().clone());
        }

        public final int getType() {
            return this.type;
        }
    }

    public SecureProtocol() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1302666ebab1ef02ccb8a5beded5b5bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1302666ebab1ef02ccb8a5beded5b5bc");
        } else {
            this.protocolHelper = new a();
        }
    }

    public abstract void log(String str);

    public abstract boolean loggable();

    public synchronized SecureProtocolData read(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4be246bd8eb31d254ec433db52bf113", 6917529027641081856L)) {
            return (SecureProtocolData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4be246bd8eb31d254ec433db52bf113");
        }
        return this.protocolHelper.a(inputStream);
    }

    public synchronized void write(SecureProtocolData secureProtocolData) throws IOException {
        Object[] objArr = {secureProtocolData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fdabb3393977523f4c2c69816c7220d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fdabb3393977523f4c2c69816c7220d");
            return;
        }
        if (secureProtocolData != null) {
            write(secureProtocolData.out, secureProtocolData.flag, secureProtocolData.payload, secureProtocolData.array, secureProtocolData.isSecure, secureProtocolData.totalLength, secureProtocolData.noSecureLength);
        }
    }

    public synchronized void write(OutputStream outputStream, int i, String str, byte[] bArr, boolean z, int i2, int i3) throws IOException {
        byte[] bArr2;
        Object[] objArr = {outputStream, Integer.valueOf(i), str, bArr, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47e8fbbbe2a4a9886f71cdc2e3e1d057", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47e8fbbbe2a4a9886f71cdc2e3e1d057");
        } else if (i == 0) {
            outputStream.write(0);
        } else {
            a aVar = this.protocolHelper;
            Object[] objArr2 = {Integer.valueOf(i), str, bArr, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "cc1c6fa95d123d6cb44424c045484a59", 6917529027641081856L)) {
                bArr2 = (byte[]) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "cc1c6fa95d123d6cb44424c045484a59");
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(-1);
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write((byte) i);
                if (z) {
                    byteArrayOutputStream.write(1);
                } else {
                    byteArrayOutputStream.write(0);
                }
                byteArrayOutputStream.write((byte) (i2 >>> 24));
                byteArrayOutputStream.write((byte) (i2 >>> 16));
                byteArrayOutputStream.write((byte) (i2 >>> 8));
                byteArrayOutputStream.write((byte) i2);
                byteArrayOutputStream.write((byte) (i3 >>> 8));
                byteArrayOutputStream.write((byte) i3);
                if (i2 > 0) {
                    byteArrayOutputStream.write(bArr);
                }
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                bArr2 = byteArray;
            }
            if (!SecureTools.isEmpty(bArr2)) {
                outputStream.write(bArr2);
                outputStream.flush();
            }
        }
    }
}
