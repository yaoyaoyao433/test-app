package com.dianping.picassocontroller.debug;

import com.dianping.jscore.Value;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private final Object b;

    private void a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        Object[] objArr = {byteArrayOutputStream, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39bac5fe01a914903ea7d6eb44835297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39bac5fe01a914903ea7d6eb44835297");
            return;
        }
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        byte[] bArr;
        Object[] objArr = {byteArrayOutputStream, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45583baad758eaa883a88525f88cc15e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45583baad758eaa883a88525f88cc15e");
        } else if (obj instanceof Number) {
            byteArrayOutputStream.write(68);
            double doubleValue = Double.valueOf(String.valueOf(obj)).doubleValue();
            Object[] objArr2 = {byteArrayOutputStream, Double.valueOf(doubleValue)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5ff0f8a289a01099b67520b40467cd5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5ff0f8a289a01099b67520b40467cd5");
                return;
            }
            long doubleToRawLongBits = Double.doubleToRawLongBits(doubleValue);
            byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 56));
            byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 48));
            byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 40));
            byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 32));
            byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 24));
            byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 16));
            byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 8));
            byteArrayOutputStream.write((byte) doubleToRawLongBits);
        } else if (obj instanceof String) {
            byteArrayOutputStream.write(83);
            String str = (String) obj;
            Object[] objArr3 = {byteArrayOutputStream, str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31fd43e38f324b42036b0298fe090842", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31fd43e38f324b42036b0298fe090842");
                return;
            }
            try {
                bArr = str.getBytes("UTF-16LE");
            } catch (Exception unused) {
                bArr = new byte[0];
            }
            int length = bArr.length;
            a(byteArrayOutputStream, length);
            byteArrayOutputStream.write(bArr, 0, length);
        } else if (obj instanceof Boolean) {
            byteArrayOutputStream.write(66);
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object[] objArr4 = {byteArrayOutputStream, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4d3c80e34138c68c75e1298cf3b609f5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4d3c80e34138c68c75e1298cf3b609f5");
            } else {
                byteArrayOutputStream.write(booleanValue ? (byte) 1 : (byte) 0);
            }
        } else if (obj instanceof JSONObject) {
            byteArrayOutputStream.write(79);
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a(byteArrayOutputStream, next.hashCode());
                a(byteArrayOutputStream, jSONObject.opt(next));
            }
            a(byteArrayOutputStream, 0);
        } else if (obj instanceof JSONArray) {
            byteArrayOutputStream.write(65);
            JSONArray jSONArray = (JSONArray) obj;
            a(byteArrayOutputStream, jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                a(byteArrayOutputStream, jSONArray.opt(i));
            }
        } else {
            byteArrayOutputStream.write(78);
        }
    }

    public i(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127dd66f0dbf31915d969afbbd6190a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127dd66f0dbf31915d969afbbd6190a3");
        } else {
            this.b = obj;
        }
    }

    public final Value a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af0179d22d957b27324b3c235f5eeef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af0179d22d957b27324b3c235f5eeef");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayOutputStream, this.b);
        return new Value(byteArrayOutputStream.toByteArray());
    }
}
