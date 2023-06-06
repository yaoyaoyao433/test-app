package com.facebook.react.views.progressbar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.bb;
import com.facebook.react.viewmanagers.b;
/* compiled from: ProGuard */
@ReactModule(name = ReactProgressBarViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactProgressBarViewManager extends BaseViewManager<a, ProgressBarShadowNode> implements b<a> {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();
    private final bb<a> mDelegate = new com.facebook.react.viewmanagers.a(this);

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.b
    public void setTypeAttr(a aVar, @Nullable String str) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a aVar, Object obj) {
    }

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        return new a(aoVar);
    }

    @Override // com.facebook.react.viewmanagers.b
    @ReactProp(name = PROP_STYLE)
    public void setStyleAttr(a aVar, @Nullable String str) {
        aVar.setStyle(str);
    }

    @Override // com.facebook.react.viewmanagers.b
    @ReactProp(customType = "Color", name = "color")
    public void setColor(a aVar, @Nullable Integer num) {
        aVar.setColor(num);
    }

    @Override // com.facebook.react.viewmanagers.b
    @ReactProp(name = PROP_INDETERMINATE)
    public void setIndeterminate(a aVar, boolean z) {
        aVar.setIndeterminate(z);
    }

    @Override // com.facebook.react.viewmanagers.b
    @ReactProp(name = "progress")
    public void setProgress(a aVar, double d) {
        aVar.setProgress(d);
    }

    @Override // com.facebook.react.viewmanagers.b
    @ReactProp(name = PROP_ANIMATING)
    public void setAnimating(a aVar, boolean z) {
        aVar.setAnimating(z);
    }

    @Override // com.facebook.react.viewmanagers.b
    public void setTestID(a aVar, @Nullable String str) {
        super.setTestId(aVar, str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ProgressBarShadowNode createShadowNodeInstance() {
        return new ProgressBarShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<ProgressBarShadowNode> getShadowNodeClass() {
        return ProgressBarShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public bb<a> getDelegate() {
        return this.mDelegate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getStyleFromString(@Nullable String str) {
        if (str == null) {
            throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
        }
        if (str.equals("Horizontal")) {
            return 16842872;
        }
        if (str.equals("Small")) {
            return 16842873;
        }
        if (str.equals("Large")) {
            return 16842874;
        }
        if (str.equals("Inverse")) {
            return 16843399;
        }
        if (str.equals("SmallInverse")) {
            return 16843400;
        }
        if (str.equals("LargeInverse")) {
            return 16843401;
        }
        if (str.equals(DEFAULT_STYLE)) {
            return 16842871;
        }
        throw new JSApplicationIllegalArgumentException("Unknown ProgressBar style: " + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a aVar) {
        if (aVar.d == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        aVar.d.setIndeterminate(aVar.a);
        aVar.setColor(aVar.d);
        aVar.d.setProgress((int) (aVar.c * 1000.0d));
        if (aVar.b) {
            aVar.d.setVisibility(0);
        } else {
            aVar.d.setVisibility(4);
        }
    }
}
