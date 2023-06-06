package com.dianping.picasso;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextPaint;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.model.Encoding;
import com.dianping.jscore.model.JSONBuilder;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoEnvironment implements Encoding {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Context globalContext;
    private static PicassoEnvironment instance;
    public int appID;
    public String appName;
    public String appVersion;
    private String deviceBrand;
    public float deviceHeight;
    private String deviceModel;
    public float deviceWidth;
    protected float fontDescender;
    protected float fontLineHeight;
    public boolean isDebug;
    private String osVersion;
    public String picassoVersion;
    public String platform;
    public String runtimePattern;
    public float scale;
    private float statusBarHeight;
    public String unionId;

    public PicassoEnvironment(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0a247ee856c3ea2612235889268114b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0a247ee856c3ea2612235889268114b");
            return;
        }
        this.deviceModel = Build.MODEL;
        this.deviceBrand = Build.BRAND;
        this.osVersion = String.valueOf(Build.VERSION.SDK_INT);
        this.scale = 1.0f;
        this.appID = -1;
        if (context == null) {
            return;
        }
        globalContext = context.getApplicationContext();
        ParsingJSHelper.sContext = context.getApplicationContext();
        this.deviceWidth = PicassoUtils.px2dp(context, PicassoUtils.getScreenWidthPixels(context));
        this.deviceHeight = PicassoUtils.px2dp(context, PicassoUtils.getScreenHeightPixels(context));
        this.statusBarHeight = PicassoUtils.getStatusbarHeight(context);
        Resources system = Resources.getSystem();
        if (system != null && system.getDisplayMetrics() != null) {
            this.scale = system.getDisplayMetrics().density;
        }
        Paint.FontMetrics metrics = getMetrics(context);
        this.fontLineHeight = PicassoTextUtils.px2dip(context, metrics.bottom - metrics.top);
        this.fontDescender = PicassoTextUtils.px2dip(context, metrics.bottom);
        this.platform = "Android";
        this.runtimePattern = DiagnoseLog.NATIVE;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.appName = packageInfo.packageName;
            this.appVersion = packageInfo.versionName;
            this.picassoVersion = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("PICASSO_VERSION");
        } catch (Exception e) {
            e.printStackTrace();
        }
        PicassoHorn.initHorn(context);
    }

    private Paint.FontMetrics getMetrics(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ae98a9d09d97b0b900fae18d9132157", RobustBitConfig.DEFAULT_VALUE)) {
            return (Paint.FontMetrics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ae98a9d09d97b0b900fae18d9132157");
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(PicassoTextUtils.dip2px(context, 1.0f));
        textPaint.setTypeface(PicassoTextUtils.defaultTypeFace);
        return textPaint.getFontMetrics();
    }

    @Override // com.dianping.jscore.model.Encoding
    public JSONObject encode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51fbacbe4b0835f3e5b4429aa2bc2a49", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51fbacbe4b0835f3e5b4429aa2bc2a49") : new JSONBuilder().put("deviceWidth", Float.valueOf(this.deviceWidth)).put("deviceHeight", Float.valueOf(this.deviceHeight)).put("scale", Float.valueOf(this.scale)).put("platform", this.platform).put("runtimePattern", this.runtimePattern).put("osVersion", this.osVersion).put("picassoVersion", this.picassoVersion).put(DeviceInfo.DEVICE_MODEL, this.deviceModel).put("deviceBrand", this.deviceBrand).put("appName", this.appName).put("appVersion", this.appVersion).put("isDebug", Boolean.valueOf(this.isDebug)).put("appId", Integer.valueOf(this.appID)).put("fontLineHeight", Float.valueOf(this.fontLineHeight)).put("fontDescender", Float.valueOf(this.fontDescender)).put("statusBarHeight", Float.valueOf(this.statusBarHeight)).toJSONObject();
    }

    public static PicassoEnvironment getPicassoEnvironment(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b3af83dccc59349e996e17500d73083", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoEnvironment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b3af83dccc59349e996e17500d73083");
        }
        if (instance != null) {
            return instance;
        }
        if (context == null) {
            return new PicassoEnvironment(null);
        }
        PicassoEnvironment picassoEnvironment = new PicassoEnvironment(context);
        instance = picassoEnvironment;
        return picassoEnvironment;
    }

    @Override // com.dianping.jscore.model.Encoding
    public String[] getFunctionNames() {
        return new String[0];
    }

    @Override // com.dianping.jscore.model.Encoding
    public JavaScriptInterface[] getFunctions() {
        return new JavaScriptInterface[0];
    }
}
