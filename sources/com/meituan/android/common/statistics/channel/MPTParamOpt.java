package com.meituan.android.common.statistics.channel;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MPTParamOpt {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, String> mMap;
    private Intent mNewIntent;

    public MPTParamOpt(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "858ed892d087371079fde24baff7962e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "858ed892d087371079fde24baff7962e");
            return;
        }
        this.mNewIntent = builder.intent;
        this.mMap = builder.map;
        if (this.mNewIntent == null || this.mNewIntent.getData() == null || this.mMap == null) {
            return;
        }
        Uri.Builder buildUpon = this.mNewIntent.getData().buildUpon();
        for (Map.Entry<String, String> entry : this.mMap.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        this.mNewIntent.setData(buildUpon.build());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Intent intent;
        private Map<String, String> map;

        public Builder(Intent intent) {
            Object[] objArr = {intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a76d8a30e1ebcc5678212f1b69ba76f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a76d8a30e1ebcc5678212f1b69ba76f");
                return;
            }
            this.intent = intent;
            this.map = new HashMap();
        }

        public Builder append(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "871fbcf2dafcfae4140482accc3163f2", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "871fbcf2dafcfae4140482accc3163f2");
            }
            if (!TextUtils.isEmpty(str)) {
                this.map.put(str, str2);
            }
            return this;
        }

        public MPTParamOpt build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "378dfa16f1d07f2c492a3cf7d7d1a2e0", 6917529027641081856L) ? (MPTParamOpt) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "378dfa16f1d07f2c492a3cf7d7d1a2e0") : new MPTParamOpt(this);
        }
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c67bf0bdaaf36b7734dafbf7906207fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c67bf0bdaaf36b7734dafbf7906207fb");
        } else if (this.mNewIntent != null && this.mMap != null) {
            Uri data = this.mNewIntent.getData();
            Set<String> queryParameterNames = data.getQueryParameterNames();
            Uri.Builder buildUpon = data.buildUpon();
            buildUpon.clearQuery();
            if (queryParameterNames != null) {
                for (String str : queryParameterNames) {
                    if (!this.mMap.containsKey(str)) {
                        buildUpon.appendQueryParameter(str, data.getQueryParameter(str));
                    }
                }
            }
            this.mNewIntent.setData(buildUpon.build());
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c930702f789900dbdfd8d894c614d44d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c930702f789900dbdfd8d894c614d44d") : this.mNewIntent == null ? "" : this.mNewIntent.getData().toString();
    }
}
