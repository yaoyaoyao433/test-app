package com.sankuai.titans.base.titlebar;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.protocol.webcompat.elements.ITitleContent;
import com.sankuai.titans.protocol.webcompat.elements.OnTitleBarEventListener;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DefaultTitleContent extends FrameLayout implements View.OnClickListener, ITitleContent {
    private static final String TAG = "knb_titlebar";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ITitleContent.IImageTitleInterceptor mImageTitleInterceptor;
    private boolean mIsDetached;
    private View.OnClickListener mOnClickListener;
    private final ImageView mTitleImgView;
    private String mTitleText;
    private final TextView mTitleTextView;
    protected OnTitleBarEventListener onTitleBarEventListener;

    public DefaultTitleContent(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5cd52edb1948400db0589140f8933ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5cd52edb1948400db0589140f8933ab");
            return;
        }
        this.mIsDetached = false;
        View inflate = LayoutInflater.from(context).inflate(R.layout.titans_protocol_title_content_default, (ViewGroup) this, true);
        this.mTitleTextView = (TextView) inflate.findViewById(R.id.tv_titans_title_content);
        this.mTitleImgView = (ImageView) inflate.findViewById(R.id.iv_titans_title_content);
        this.mTitleImgView.setOnClickListener(this);
        this.mTitleTextView.setOnClickListener(this);
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setTitleText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cd24c95b5ea3eb11e0cb115c58e1907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cd24c95b5ea3eb11e0cb115c58e1907");
            return;
        }
        this.mTitleImgView.setVisibility(8);
        this.mTitleTextView.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.mTitleText = str;
        this.mTitleTextView.setText(this.mTitleText);
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public String getTitleText() {
        return this.mTitleText;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public int getCalculatedWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4f470dcbf865d3fb54d187666e6e158", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4f470dcbf865d3fb54d187666e6e158")).intValue() : getWidth();
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setTitleContentParams(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd4857c73ef8bc0aba1fc24cbd3d1ded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd4857c73ef8bc0aba1fc24cbd3d1ded");
        } else if (jSONObject == null) {
        } else {
            try {
                this.mTitleTextView.setTextColor(jSONObject.optInt("color"));
            } catch (Exception e) {
                Titans.serviceManager().getStatisticsService().reportClassError("DefaultTitleContent", "setTitleContentParams", e);
            }
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setOnTitleBarEventListener(OnTitleBarEventListener onTitleBarEventListener) {
        this.onTitleBarEventListener = onTitleBarEventListener;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setTitleImageLayout(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "231d52c8f716cdfea229fef2303af81b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "231d52c8f716cdfea229fef2303af81b");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mTitleImgView.getLayoutParams();
        if (i > 0) {
            layoutParams.width = i;
        }
        if (i2 > 0) {
            layoutParams.height = i2;
        }
        this.mTitleImgView.requestLayout();
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public boolean setTitleImage(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d69aaa8baa225f8a39323cf90a24fab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d69aaa8baa225f8a39323cf90a24fab")).booleanValue();
        }
        if (bitmap == null) {
            return false;
        }
        this.mTitleTextView.setVisibility(8);
        this.mTitleImgView.setVisibility(0);
        this.mTitleImgView.setImageBitmap(bitmap);
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff428261785ea59adf9685c9845f1da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff428261785ea59adf9685c9845f1da4");
        } else {
            setOnTitleClickListener(onClickListener);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void runOnUiThread(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cf382ea2a92627c0b0c9b0a2807d307", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cf382ea2a92627c0b0c9b0a2807d307");
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    Titans.serviceManager().getStatisticsService().reportClassError("DefaultTitleContent", "runOnUiThread", e);
                    return;
                }
            }
            post(new Runnable() { // from class: com.sankuai.titans.base.titlebar.DefaultTitleContent.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab8905a51dff70fbe3ee289fede722ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab8905a51dff70fbe3ee289fede722ae");
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Exception e2) {
                        Titans.serviceManager().getStatisticsService().reportClassError("DefaultTitleContent", "runOnUiThread", e2);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setImageTitleInterceptor(ITitleContent.IImageTitleInterceptor iImageTitleInterceptor) {
        this.mImageTitleInterceptor = iImageTitleInterceptor;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public ITitleContent.IImageTitleInterceptor getImageTitleInterceptor() {
        return this.mImageTitleInterceptor;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "698ddca7c592ee41583acf54eafdf15c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "698ddca7c592ee41583acf54eafdf15c");
            return;
        }
        super.onAttachedToWindow();
        this.mIsDetached = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa21b3f0095ac65d604e5e6988a6a889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa21b3f0095ac65d604e5e6988a6a889");
            return;
        }
        super.onDetachedFromWindow();
        this.mIsDetached = true;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public boolean isDetachedFromWindow() {
        return this.mIsDetached;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "163a05031bd179a5e6d3fdc4315315f4", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "163a05031bd179a5e6d3fdc4315315f4");
            return;
        }
        if (this.onTitleBarEventListener != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", "action");
            } catch (JSONException e) {
                Titans.serviceManager().getStatisticsService().reportClassError("DefaultTitleContent", "onClick", e);
            }
            this.onTitleBarEventListener.onEvent(jSONObject);
        }
        if (this.mOnClickListener != null) {
            this.mOnClickListener.onClick(view);
        }
    }
}
