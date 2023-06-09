package com.huawei.hms.framework.network.grs.local.model;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.robust.common.CommonConstant;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CountryCodeBean {
    private static final String ANDRIOD_SYSTEMPROP = "android.os.SystemProperties";
    private static final int COUNTRYCODE_SIZE = 2;
    private static final String LOCALE_COUNTRYSYSTEMPROP = "ro.product.locale";
    private static final String LOCALE_REGION_COUNTRYSYSTEMPROP = "ro.product.locale.region";
    private static final String SPECIAL_COUNTRYCODE_CN = "cn";
    private static final String SPECIAL_COUNTRYCODE_EU = "eu";
    private static final String SPECIAL_COUNTRYCODE_GB = "gb";
    private static final String SPECIAL_COUNTRYCODE_LA = "la";
    private static final String SPECIAL_COUNTRYCODE_UK = "uk";
    private static final String TAG = "CountryCodeBean";
    private static final String VENDORCOUNTRY_SYSTEMPROP = "ro.hw.country";
    private String countryCode;
    private String countrySource = GrsBaseInfo.CountryCodeSource.UNKNOWN;

    public CountryCodeBean(Context context, boolean z) {
        this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        init(context, z);
        this.countryCode = this.countryCode.toUpperCase(Locale.ENGLISH);
    }

    private void checkCodeLenth() {
        String str = this.countryCode;
        if (str == null || str.length() != 2) {
            this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            this.countrySource = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    private void getLocaleCountryCode() {
        if (EmuiUtil.isUpPVersion()) {
            getRegionSettingCountryCode();
        } else {
            getProductCountryCode();
        }
        this.countrySource = GrsBaseInfo.CountryCodeSource.LOCALE_INFO;
    }

    private void getProductCountryCode() {
        int lastIndexOf;
        this.countryCode = SystemPropUtils.getProperty("get", LOCALE_REGION_COUNTRYSYSTEMPROP, ANDRIOD_SYSTEMPROP, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        String str = TAG;
        Logger.i(str, "countryCode by ro.product.locale.region is:" + this.countryCode);
        if (TextUtils.isEmpty(this.countryCode) || GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(this.countryCode)) {
            String property = SystemPropUtils.getProperty("get", LOCALE_COUNTRYSYSTEMPROP, ANDRIOD_SYSTEMPROP, GrsBaseInfo.CountryCodeSource.UNKNOWN);
            if (!TextUtils.isEmpty(property) && (lastIndexOf = property.lastIndexOf(CommonConstant.Symbol.MINUS)) != -1) {
                this.countryCode = property.substring(lastIndexOf + 1);
                String str2 = TAG;
                Logger.i(str2, "countryCode by ro.product.locale is:" + this.countryCode);
            }
        }
        if ("cn".equalsIgnoreCase(this.countryCode)) {
            return;
        }
        this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    private void getRegionSettingCountryCode() {
        this.countryCode = Locale.getDefault().getCountry();
        String str = TAG;
        Logger.i(str, "countryCode by system's region setting is: " + this.countryCode);
        if (TextUtils.isEmpty(this.countryCode)) {
            this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    private void getSimCountryCode(Context context) {
        getSimCountryCode(context, false);
    }

    private void getSimCountryCode(Context context, boolean z) {
        String str;
        StringBuilder sb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        if (telephonyManager != null) {
            if (!z || telephonyManager.getPhoneType() == 2) {
                this.countryCode = telephonyManager.getSimCountryIso();
                this.countrySource = GrsBaseInfo.CountryCodeSource.SIM_COUNTRY;
                str = TAG;
                sb = new StringBuilder("countryCode by SimCountryIso is: ");
            } else {
                this.countryCode = telephonyManager.getNetworkCountryIso();
                this.countrySource = GrsBaseInfo.CountryCodeSource.NETWORK_COUNTRY;
                str = TAG;
                sb = new StringBuilder("countryCode by NetworkCountryIso is: ");
            }
            sb.append(this.countryCode);
            Logger.i(str, sb.toString());
        }
        checkCodeLenth();
    }

    private void getVendorCountryCode() {
        String str;
        this.countrySource = GrsBaseInfo.CountryCodeSource.VENDOR_COUNTRY;
        this.countryCode = SystemPropUtils.getProperty("get", VENDORCOUNTRY_SYSTEMPROP, ANDRIOD_SYSTEMPROP, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        String str2 = TAG;
        Logger.i(str2, "countryCode by ro.hw.country is: " + this.countryCode);
        if (SPECIAL_COUNTRYCODE_EU.equalsIgnoreCase(this.countryCode) || SPECIAL_COUNTRYCODE_LA.equalsIgnoreCase(this.countryCode)) {
            this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        } else if (!SPECIAL_COUNTRYCODE_UK.equalsIgnoreCase(this.countryCode)) {
            checkCodeLenth();
            return;
        } else {
            Logger.i(TAG, "special country of UK to map GB.");
            this.countryCode = SPECIAL_COUNTRYCODE_GB;
            str = GrsBaseInfo.CountryCodeSource.VENDOR_COUNTRY;
        }
        this.countrySource = str;
    }

    private void init(Context context, boolean z) {
        if (context == null) {
            throw new NullPointerException("context must be not null.Please provide app's Context");
        }
        try {
            getVendorCountryCode();
            if (isCodeValidate()) {
                Logger.i(TAG, "get issue_country code from VENDOR_COUNTRY");
                return;
            }
            getSimCountryCode(context);
            if (isCodeValidate()) {
                Logger.i(TAG, "get issue_country code from SIM_COUNTRY");
                return;
            }
            getLocaleCountryCode();
            if (isCodeValidate()) {
                Logger.i(TAG, "get issue_country code from LOCALE_INFO");
            }
        } catch (Exception unused) {
            Logger.w(TAG, "get CountryCode error");
        }
    }

    private boolean isCodeValidate() {
        return !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(this.countryCode);
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountrySource() {
        return this.countrySource;
    }
}
