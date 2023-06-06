package com.sankuai.meituan.mapfoundation.storage;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.cipstorage.CIPSBusinessCleaner;
import com.meituan.android.cipstorage.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class StorageCleaner extends CIPSBusinessCleaner {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, a> listeners = new ConcurrentHashMap();

    public static void addEventListener(String str, a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "723514b23f0a571791049a98511c33bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "723514b23f0a571791049a98511c33bd");
        } else if (TextUtils.isEmpty(str) || aVar == null) {
        } else {
            listeners.put(str, aVar);
        }
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onConfigExceed(String str, af.a aVar, long j, long j2) {
        a aVar2;
        Object[] objArr = {str, aVar, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe2bd0ab66d3bb591c4b58ffe479048b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe2bd0ab66d3bb591c4b58ffe479048b");
        } else if (TextUtils.isEmpty(str) || (aVar2 = listeners.get(str)) == null) {
        } else {
            aVar2.a(str, transfer(aVar), j, j2);
        }
    }

    public c transfer(af.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b085d8996c4d60ac84dce8ef8a234ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b085d8996c4d60ac84dce8ef8a234ad");
        }
        if (aVar == null) {
            return null;
        }
        return new c(aVar.a, aVar.b, aVar.c, aVar.e, aVar.d, aVar.f);
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onStorageExceed(String str, af.a aVar, long j) {
        a aVar2;
        Object[] objArr = {str, aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17db876baba818700885b8f5fa5e606c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17db876baba818700885b8f5fa5e606c");
        } else if (TextUtils.isEmpty(str) || (aVar2 = listeners.get(str)) == null) {
        } else {
            aVar2.a(str, transfer(aVar), j);
        }
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onCleanExpiredCacheStart(String str, af.a aVar, long j) {
        a aVar2;
        Object[] objArr = {str, aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "229db18968d02125ff566bdb46bae749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "229db18968d02125ff566bdb46bae749");
        } else if (TextUtils.isEmpty(str) || (aVar2 = listeners.get(str)) == null) {
        } else {
            aVar2.b(str, transfer(aVar), j);
        }
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onCleanExpiredCacheOver(String str, af.a aVar, long j) {
        a aVar2;
        Object[] objArr = {str, aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ef0a939b4df757a3d9144636c365aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ef0a939b4df757a3d9144636c365aaf");
        } else if (TextUtils.isEmpty(str) || (aVar2 = listeners.get(str)) == null) {
        } else {
            aVar2.c(str, transfer(aVar), j);
        }
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onClearCacheStart(String str, af.a aVar) {
        a aVar2;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f815438db0d678eb0929813b36abf155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f815438db0d678eb0929813b36abf155");
        } else if (TextUtils.isEmpty(str) || (aVar2 = listeners.get(str)) == null) {
        } else {
            aVar2.a(str, transfer(aVar));
        }
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onClearCacheOver(String str, af.a aVar) {
        a aVar2;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be0f90dc0fb280995ef0ca7972ed0ea2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be0f90dc0fb280995ef0ca7972ed0ea2");
        } else if (TextUtils.isEmpty(str) || (aVar2 = listeners.get(str)) == null) {
        } else {
            aVar2.b(str, transfer(aVar));
        }
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onClearDataStart(String str, af.a aVar) {
        a aVar2;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d1971272c103cefa02e893c244cf4ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d1971272c103cefa02e893c244cf4ab");
        } else if (TextUtils.isEmpty(str) || (aVar2 = listeners.get(str)) == null) {
        } else {
            aVar2.c(str, transfer(aVar));
        }
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onClearDataOver(String str, af.a aVar) {
        a aVar2;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01b4390db4eac5fafb4062f16d4ced9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01b4390db4eac5fafb4062f16d4ced9d");
        } else if (TextUtils.isEmpty(str) || (aVar2 = listeners.get(str)) == null) {
        } else {
            aVar2.d(str, transfer(aVar));
        }
    }
}
