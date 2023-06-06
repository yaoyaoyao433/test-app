package com.dianping.picasso.model.params;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoModelParams<T extends PicassoModel> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public GradientDrawable backgroundDrawable;
    public int borderColor;
    public int borderWidth;
    public float[] cornerRadii;
    public int cornerRadius;
    public JSONObject extraObject;
    public JSONObject gaUserInfoObject;
    public int height;
    public int offset;
    protected float scaleInput;
    public int sdColor;
    public int sdOffsetX;
    public int sdOffsetY;
    public float sdOpacity;
    public int sdRadius;
    public int width;
    public int x;
    public int y;

    public PicassoModelParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c507c692f540610257581b550ea98ca4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c507c692f540610257581b550ea98ca4");
            return;
        }
        this.backgroundDrawable = new GradientDrawable();
        this.sdColor = -16777216;
        this.borderColor = -16777216;
        this.scaleInput = 0.0f;
    }

    @Deprecated
    public int dip2px(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14959130a08d06622222485f7e29d877", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14959130a08d06622222485f7e29d877")).intValue() : PicassoUtils.dip2px(PicassoEnvironment.globalContext, f, f2);
    }

    @Deprecated
    public int dip2px(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68367d25e97a7494e87cc03f2587bf87", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68367d25e97a7494e87cc03f2587bf87")).intValue() : PicassoUtils.dip2px(PicassoEnvironment.globalContext, f, this.scaleInput);
    }

    public int dp2px(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc3cedc4a9705e47f5aaa62585713c09", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc3cedc4a9705e47f5aaa62585713c09")).intValue() : PicassoUtils.dp2px(PicassoEnvironment.globalContext, f, f2);
    }

    public int dp2px(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16987ecf98cf16ed6850bcbf9a8760a8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16987ecf98cf16ed6850bcbf9a8760a8")).intValue() : PicassoUtils.dp2px(PicassoEnvironment.globalContext, f, this.scaleInput);
    }

    public void switchModel(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c047efc759b531d8d73ae29cf4b4cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c047efc759b531d8d73ae29cf4b4cd0");
            return;
        }
        this.scaleInput = PicassoEnvironment.globalContext.getResources().getDisplayMetrics().density;
        this.width = dp2px(t.width, this.scaleInput);
        this.height = dp2px(t.height, this.scaleInput);
        this.x = dp2px(t.x, this.scaleInput);
        this.y = dp2px(t.y, this.scaleInput);
        this.backgroundDrawable = getGradientBackground(t);
        try {
            if (!TextUtils.isEmpty(t.gaUserInfo)) {
                this.gaUserInfoObject = new JSONObject(t.gaUserInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (TextUtils.isEmpty(t.extra)) {
                return;
            }
            this.extraObject = new JSONObject(t.extra);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public GradientDrawable getGradientBackground(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6747637475ed48545ee054f3d70fb864", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6747637475ed48545ee054f3d70fb864");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.borderWidth = dp2px(t.borderWidth, this.scaleInput);
        if (PicassoUtils.isValidColor(t.borderColor)) {
            this.borderColor = Color.parseColor(t.borderColor);
        }
        if (t.sdOpacity > 0.0f) {
            this.sdOpacity = t.sdOpacity;
            this.sdRadius = dp2px(t.sdRadius, this.scaleInput);
            this.sdOffsetX = dp2px(t.sdOffsetX, this.scaleInput);
            this.sdOffsetY = dp2px(t.sdOffsetY, this.scaleInput);
            this.offset = this.sdRadius + Math.max(Math.abs(this.sdOffsetX), Math.abs(this.sdOffsetY));
            if (PicassoUtils.isValidColor(t.sdColor)) {
                this.sdColor = Color.parseColor(t.sdColor);
            }
        }
        if (this.borderWidth > 0) {
            gradientDrawable.setStroke(this.borderWidth, this.borderColor);
        }
        PicassoUtils.setBackgroundColor(gradientDrawable, t);
        this.cornerRadius = dp2px(t.cornerRadius, this.scaleInput);
        if (t.cornerRadiusLT || t.cornerRadiusLB || t.cornerRadiusRT || t.cornerRadiusRB) {
            float[] fArr = new float[8];
            fArr[0] = t.cornerRadiusLT ? this.cornerRadius : 0.0f;
            fArr[1] = t.cornerRadiusLT ? this.cornerRadius : 0.0f;
            fArr[2] = t.cornerRadiusRT ? this.cornerRadius : 0.0f;
            fArr[3] = t.cornerRadiusRT ? this.cornerRadius : 0.0f;
            fArr[4] = t.cornerRadiusRB ? this.cornerRadius : 0.0f;
            fArr[5] = t.cornerRadiusRB ? this.cornerRadius : 0.0f;
            fArr[6] = t.cornerRadiusLB ? this.cornerRadius : 0.0f;
            fArr[7] = t.cornerRadiusLB ? this.cornerRadius : 0.0f;
            this.cornerRadii = fArr;
            gradientDrawable.setCornerRadii(this.cornerRadii);
        } else if (this.cornerRadius != 0) {
            this.cornerRadii = new float[]{this.cornerRadius, this.cornerRadius, this.cornerRadius, this.cornerRadius, this.cornerRadius, this.cornerRadius, this.cornerRadius, this.cornerRadius};
            gradientDrawable.setCornerRadius(this.cornerRadius);
        }
        return gradientDrawable;
    }
}
