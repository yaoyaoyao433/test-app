package com.meituan.msc.jse.bridge;

import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LazyParseJSONArray extends JSONArray {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isParsed;
    private String stringData;

    public LazyParseJSONArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c87858e72fee93e8befcfcb5cb8ff2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c87858e72fee93e8befcfcb5cb8ff2d");
            return;
        }
        this.isParsed = false;
        this.stringData = str;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: JSONException -> 0x004d, TRY_LEAVE, TryCatch #0 {JSONException -> 0x004d, blocks: (B:8:0x001c, B:10:0x0020, B:13:0x0029, B:15:0x0036, B:17:0x003c, B:14:0x0031), top: B:24:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ensureParsed() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msc.jse.bridge.LazyParseJSONArray.changeQuickRedirect
            java.lang.String r10 = "9f047bcaa6b8ec2f178b80cdf944c339"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            boolean r1 = r11.isParsed
            if (r1 != 0) goto L54
            java.lang.String r1 = r11.stringData     // Catch: org.json.JSONException -> L4d
            if (r1 == 0) goto L31
            java.lang.String r1 = r11.stringData     // Catch: org.json.JSONException -> L4d
            int r1 = r1.length()     // Catch: org.json.JSONException -> L4d
            if (r1 != 0) goto L29
            goto L31
        L29:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4d
            java.lang.String r2 = r11.stringData     // Catch: org.json.JSONException -> L4d
            r1.<init>(r2)     // Catch: org.json.JSONException -> L4d
            goto L36
        L31:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4d
            r1.<init>()     // Catch: org.json.JSONException -> L4d
        L36:
            int r2 = r1.length()     // Catch: org.json.JSONException -> L4d
            if (r0 >= r2) goto L46
            java.lang.Object r2 = r1.get(r0)     // Catch: org.json.JSONException -> L4d
            super.put(r2)     // Catch: org.json.JSONException -> L4d
            int r0 = r0 + 1
            goto L36
        L46:
            r0 = 0
            r11.stringData = r0
            r0 = 1
            r11.isParsed = r0
            goto L54
        L4d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.jse.bridge.LazyParseJSONArray.ensureParsed():void");
    }

    @Override // org.json.JSONArray
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec3a904a32cd6bdb4d34bb02a55e0b38", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec3a904a32cd6bdb4d34bb02a55e0b38");
        }
        if (!this.isParsed) {
            return this.stringData;
        }
        return super.toString();
    }

    @Override // org.json.JSONArray
    public String toString(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c6f3283d5d76e8148455201ae3affcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c6f3283d5d76e8148455201ae3affcc");
        }
        ensureParsed();
        return super.toString(i);
    }

    @Override // org.json.JSONArray
    public int length() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "922c09a3ad4088e76fca62be0baf6935", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "922c09a3ad4088e76fca62be0baf6935")).intValue();
        }
        ensureParsed();
        return super.length();
    }

    @Override // org.json.JSONArray
    public Object get(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51b02f3ba21924b77ee753bebf95331b", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51b02f3ba21924b77ee753bebf95331b");
        }
        ensureParsed();
        return super.get(i);
    }

    @Override // org.json.JSONArray
    public Object opt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3972b5e85343f51d1c77d1f1153ced4", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3972b5e85343f51d1c77d1f1153ced4");
        }
        ensureParsed();
        return super.opt(i);
    }

    @Override // org.json.JSONArray
    @RequiresApi(api = 19)
    public Object remove(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecab226d1106b3fed05887c1ac63fdc5", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecab226d1106b3fed05887c1ac63fdc5");
        }
        ensureParsed();
        return super.remove(i);
    }

    @Override // org.json.JSONArray
    public JSONObject toJSONObject(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a4177f0be5b61bfcc5420643af6735b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a4177f0be5b61bfcc5420643af6735b");
        }
        ensureParsed();
        return super.toJSONObject(jSONArray);
    }

    @Override // org.json.JSONArray
    public String join(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e45f7e2dd8cd44faa72c810133a2f33", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e45f7e2dd8cd44faa72c810133a2f33");
        }
        ensureParsed();
        return super.join(str);
    }

    @Override // org.json.JSONArray
    public JSONArray put(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba6cd2f165c6ab9213e1fa6ec7e0d692", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba6cd2f165c6ab9213e1fa6ec7e0d692");
        }
        ensureParsed();
        return super.put(z);
    }

    @Override // org.json.JSONArray
    public JSONArray put(double d) throws JSONException {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05a54e7aa9ce370cd6ae2d94e2232f42", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05a54e7aa9ce370cd6ae2d94e2232f42");
        }
        ensureParsed();
        return super.put(d);
    }

    @Override // org.json.JSONArray
    public JSONArray put(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48adfa977c87b0e2d068ccbd97b6f5af", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48adfa977c87b0e2d068ccbd97b6f5af");
        }
        ensureParsed();
        return super.put(i);
    }

    @Override // org.json.JSONArray
    public JSONArray put(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2836adfa9c06d5208c762bc455953178", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2836adfa9c06d5208c762bc455953178");
        }
        ensureParsed();
        return super.put(j);
    }

    @Override // org.json.JSONArray
    public JSONArray put(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06ff11659a7c22f27d84b8ee14af44db", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06ff11659a7c22f27d84b8ee14af44db");
        }
        ensureParsed();
        return super.put(obj);
    }

    @Override // org.json.JSONArray
    public JSONArray put(int i, Object obj) throws JSONException {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02c348972f0c420026d46da2fff3e30f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02c348972f0c420026d46da2fff3e30f");
        }
        ensureParsed();
        return super.put(i, obj);
    }
}
