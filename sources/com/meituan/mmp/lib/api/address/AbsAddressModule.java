package com.meituan.mmp.lib.api.address;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsAddressModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsChooseAddress extends ApiFunction<ChooseAddressParams, ChooseAddressResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ChooseAddressParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bizId;
        public String env;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ChooseAddressResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String cityName;
        public String countyName;
        public String detailInfo;
        public String errMsg;
        public String nationalCode;
        public String postalCode;
        public String provinceName;
        public String telNumber;
        public String userName;
    }
}
