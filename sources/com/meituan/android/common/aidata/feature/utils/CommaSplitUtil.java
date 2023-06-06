package com.meituan.android.common.aidata.feature.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommaSplitUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public static List<String> commaSplitStrToList(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a391083215a951f6c0ffd85c42c47fb1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a391083215a951f6c0ffd85c42c47fb1") : charSplitStrToList(str, CommonConstant.Symbol.COMMA);
    }

    @Nullable
    public static List<String> charSplitStrToList(@Nullable String str, String str2) {
        String[] split;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4152f750c6526824860f7348980cbbf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4152f750c6526824860f7348980cbbf0");
        }
        if (str != null) {
            arrayList = new ArrayList();
            for (String str3 : str.split(String.valueOf(str2))) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(str3);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
        }
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SplitStrBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<String> mDataList;
        private String mSplitStr;

        public SplitStrBuilder(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4087f341570a465d63b3daf17643a090", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4087f341570a465d63b3daf17643a090");
                return;
            }
            this.mSplitStr = str;
            this.mDataList = new LinkedList();
        }

        public static SplitStrBuilder create(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cfecf0b5674ac377f205f68b9293b40a", RobustBitConfig.DEFAULT_VALUE) ? (SplitStrBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cfecf0b5674ac377f205f68b9293b40a") : new SplitStrBuilder(str);
        }

        public SplitStrBuilder add(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2f2262f5cae21cfce90092c1e4f7db8", RobustBitConfig.DEFAULT_VALUE)) {
                return (SplitStrBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2f2262f5cae21cfce90092c1e4f7db8");
            }
            if (!TextUtils.isEmpty(str)) {
                this.mDataList.add(str);
            }
            return this;
        }

        public String build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65b8294ca414b3b5eaf541f1a76bddfb", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65b8294ca414b3b5eaf541f1a76bddfb");
            }
            if (this.mDataList != null) {
                boolean z = true;
                boolean z2 = !this.mSplitStr.isEmpty();
                StringBuilder sb = new StringBuilder();
                for (String str : this.mDataList) {
                    if (!TextUtils.isEmpty(str)) {
                        if (!z && z2) {
                            sb.append(this.mSplitStr);
                        }
                        sb.append(str);
                        z = false;
                    }
                }
                return sb.toString();
            }
            return "";
        }
    }
}
