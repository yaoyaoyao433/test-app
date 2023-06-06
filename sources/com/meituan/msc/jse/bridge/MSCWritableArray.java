package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCWritableArray extends MSCReadableArray implements WritableArray {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MSCWritableArray() {
    }

    public MSCWritableArray(JSONArray jSONArray) {
        super(jSONArray);
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35360984afba31625c2ed8b8a4e9b973", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35360984afba31625c2ed8b8a4e9b973");
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushNull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96691d55949c40d4a8ad438db217a096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96691d55949c40d4a8ad438db217a096");
        } else {
            this.array.put((Object) null);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushBoolean(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a73d1bd9977e2f44a8de8b21f1933c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a73d1bd9977e2f44a8de8b21f1933c10");
        } else {
            this.array.put(z);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushDouble(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c662010f94b06cf7f8c95abe08fcf34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c662010f94b06cf7f8c95abe08fcf34");
            return;
        }
        try {
            this.array.put(d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92b4485ba49d19be98fa0ccb424fad63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92b4485ba49d19be98fa0ccb424fad63");
        } else {
            this.array.put(i);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushString(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4c16bd6b4fac3e3358ab2be0e3cb180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4c16bd6b4fac3e3358ab2be0e3cb180");
        } else {
            this.array.put(str);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushArray(@Nullable ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "629fedb9035d327f6afc4a817513acb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "629fedb9035d327f6afc4a817513acb0");
        } else if (!(readableArray instanceof MSCReadableArray)) {
            throw new RuntimeException("value must be MSCReadableArray");
        } else {
            this.array.put(((MSCReadableArray) readableArray).getRealData());
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushMap(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9766df2e64b0a288cc921c499ffc1f57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9766df2e64b0a288cc921c499ffc1f57");
        } else if (!(readableMap instanceof MSCReadableMap)) {
            throw new RuntimeException("value must be MSCReadableMap");
        } else {
            this.array.put(((MSCReadableMap) readableMap).getRealData());
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushArray(@Nullable WritableArray writableArray) {
        Object[] objArr = {writableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ea142417d97d613629904dcadcc8cf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ea142417d97d613629904dcadcc8cf6");
        } else if (!(writableArray instanceof MSCWritableArray)) {
            throw new RuntimeException("value must be MSCWritableArray");
        } else {
            this.array.put(((MSCWritableArray) writableArray).getRealData());
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushMap(@Nullable WritableMap writableMap) {
        Object[] objArr = {writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df48ac0a489cd6d8be678a2b0e2294e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df48ac0a489cd6d8be678a2b0e2294e3");
        } else if (!(writableMap instanceof MSCWritableMap)) {
            throw new RuntimeException("value must be MSCWritableMap");
        } else {
            this.array.put(((MSCWritableMap) writableMap).getRealData());
        }
    }
}
