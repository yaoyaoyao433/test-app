package com.dianping.picasso;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.codelog.b;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.creator.TextViewWrapper;
import com.dianping.picasso.model.TextModel;
import com.dianping.picasso.model.params.TextViewParams;
import com.dianping.picasso.view.PicassoTextView;
import com.dianping.richtext.a;
import com.dianping.richtext.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoTextUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Typeface defaultTypeFace;
    public static HashMap<Integer, Typeface> typefaceModeMap = new HashMap<>();
    private static TextViewWrapper mFateTextViewWrapper = new TextViewWrapper();
    private static Map<Thread, PicassoTextView> mFateTextViews = new ConcurrentHashMap();

    public static void bindNewUpdateListener(TextViewParams textViewParams, i iVar) {
        a[] aVarArr;
        Object[] objArr = {textViewParams, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "31183ac5142a338c209b9f0a902f5b3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "31183ac5142a338c209b9f0a902f5b3f");
        } else if (textViewParams.textUpdateListenerRef.get() != iVar) {
            textViewParams.textUpdateListenerRef = new WeakReference<>(iVar);
            if (textViewParams.textStringBuilder != null) {
                for (a aVar : (a[]) textViewParams.textStringBuilder.getSpans(0, textViewParams.textStringBuilder.length(), a.class)) {
                    Object[] objArr2 = {iVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "590ecb6923e7a16b245393295a3c9e95", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "590ecb6923e7a16b245393295a3c9e95");
                    } else {
                        aVar.d = new WeakReference<>(iVar);
                        if (aVar.b == 1 && aVar.c == 0 && aVar.d != null) {
                            aVar.a();
                        }
                    }
                }
            }
        }
    }

    public static JSONObject sizeToFit(TextModel textModel) {
        Object[] objArr = {textModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbd69b45c72233a838ae4528b97c33d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbd69b45c72233a838ae4528b97c33d3");
        }
        if (textModel == null || TextUtils.isEmpty(textModel.text)) {
            return BaseViewWrapper.DEFAULT_SIZE;
        }
        if (textModel.getViewParams() == null) {
            textModel.switchModel();
        }
        JSONObject jSONObject = new JSONObject();
        PicassoTextView picassoTextView = mFateTextViews.get(Thread.currentThread());
        if (picassoTextView == null) {
            picassoTextView = new PicassoTextView(PicassoEnvironment.globalContext);
            picassoTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            mFateTextViews.put(Thread.currentThread(), picassoTextView);
        }
        if (textModel.numberOfLines > 1) {
            picassoTextView.setMaxWidth(textModel.getViewParams().width != 0 ? textModel.getViewParams().width : Integer.MAX_VALUE);
        } else {
            picassoTextView.setMaxWidth(Integer.MAX_VALUE);
        }
        try {
            try {
                updateSizeToTitTextView(picassoTextView, textModel);
            } catch (Exception e) {
                b.b(PicassoTextUtils.class, "两次 sizetofit 失败，text：" + textModel.text + " e.message(): " + e.getMessage());
                return BaseViewWrapper.DEFAULT_SIZE;
            }
        } catch (Exception unused) {
            updateSizeToTitTextView(picassoTextView, textModel);
        }
        try {
            jSONObject.put("width", px2dip(picassoTextView.getContext(), picassoTextView.getMeasuredWidth()));
            jSONObject.put("height", px2dip(picassoTextView.getContext(), picassoTextView.getMeasuredHeight()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private static void updateSizeToTitTextView(PicassoTextView picassoTextView, TextModel textModel) {
        Object[] objArr = {picassoTextView, textModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54f3c6c72ade14736386d82686a61597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54f3c6c72ade14736386d82686a61597");
            return;
        }
        mFateTextViewWrapper.updateView(picassoTextView, (PicassoView) null, textModel, (TextModel) null);
        picassoTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static float dip2px(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4fa8c11438d7c832ac7fe81c1429643c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4fa8c11438d7c832ac7fe81c1429643c")).floatValue() : context == null ? f : f * context.getResources().getDisplayMetrics().density;
    }

    public static float px2dip(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83855ddc9c7d6ae2c9d01fb7c1b2084f", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83855ddc9c7d6ae2c9d01fb7c1b2084f")).floatValue() : context == null ? f : f / context.getResources().getDisplayMetrics().density;
    }

    public static float getBaseline(TextModel textModel) {
        Object[] objArr = {textModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a56184b3a5a1f05910bd38a722d2f36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a56184b3a5a1f05910bd38a722d2f36")).floatValue();
        }
        if (textModel == null || TextUtils.isEmpty(textModel.text)) {
            return 0.0f;
        }
        if (textModel.getViewParams() == null) {
            textModel.switchModel();
        }
        PicassoTextView picassoTextView = mFateTextViews.get(Thread.currentThread());
        if (picassoTextView == null) {
            picassoTextView = new PicassoTextView(PicassoEnvironment.globalContext);
            picassoTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            mFateTextViews.put(Thread.currentThread(), picassoTextView);
        }
        if (textModel.numberOfLines > 1) {
            picassoTextView.setMaxWidth(textModel.getViewParams().width != 0 ? textModel.getViewParams().width : Integer.MAX_VALUE);
        } else {
            picassoTextView.setMaxWidth(Integer.MAX_VALUE);
        }
        mFateTextViewWrapper.updateView(picassoTextView, (PicassoView) null, textModel, (TextModel) null);
        picassoTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return px2dip(picassoTextView.getContext(), picassoTextView.getLayout().getLineBaseline(picassoTextView.getLineCount() - 1));
    }
}
