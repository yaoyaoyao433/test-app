package com.meituan.android.recce.views.image;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.image.a;
import com.meituan.android.picassohelper.c;
import com.meituan.android.recce.mrn.uimanager.RecceLayoutShadowNode;
import com.meituan.android.recce.mrn.uimanager.b;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.android.recce.views.annotation.BaseView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@BaseView
/* loaded from: classes3.dex */
public class RecceImageManager extends BaseViewManager<RecceRCTRoundImageView, RecceLayoutShadowNode> implements b {
    public static final String REACT_CLASS = "RECImageView";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final WeakHashMap<RecceRCTRoundImageView, Void> mAllViewInstances;
    private final Context mContext;
    private final boolean mEnableShrink;
    private final boolean mShrinkGif;
    private float mShrinkRatio;
    private final boolean mTransformToWebp;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(RecceRCTRoundImageView recceRCTRoundImageView, Object obj) {
    }

    public RecceImageManager(Context context, boolean z, float f, boolean z2, boolean z3) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "279dae58f216a71ecd53a9574346326f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "279dae58f216a71ecd53a9574346326f");
            return;
        }
        this.mAllViewInstances = new WeakHashMap<>();
        c.a(context);
        this.mShrinkRatio = f;
        this.mShrinkGif = z2;
        this.mTransformToWebp = z3;
        this.mEnableShrink = z;
        this.mContext = context;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public PropVisitor<Void> getVisitor(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df3b1e1ed8b77b061b7f52bc210236bd", RobustBitConfig.DEFAULT_VALUE) ? (PropVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df3b1e1ed8b77b061b7f52bc210236bd") : new RecceImageManagerVisitor(this, (RecceRCTRoundImageView) view);
    }

    public Collection<RecceRCTRoundImageView> getAllViewInstances() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72325333381a73c810fae6e5215c4049", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72325333381a73c810fae6e5215c4049") : this.mAllViewInstances.keySet();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RecceRCTRoundImageView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "741b13dc4a04b0075527b26c1447756e", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecceRCTRoundImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "741b13dc4a04b0075527b26c1447756e");
        }
        RecceImageView recceImageView = new RecceImageView(aoVar);
        this.mAllViewInstances.put(recceImageView, null);
        recceImageView.setShrinkRatio(this.mShrinkRatio);
        recceImageView.setTransformToWebp(this.mTransformToWebp);
        recceImageView.setShrinkGif(this.mShrinkGif);
        recceImageView.setEnableShrink(this.mEnableShrink);
        return recceImageView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RecceLayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dc06c273d037b4fdc1cc8ec57693895", RobustBitConfig.DEFAULT_VALUE) ? (RecceLayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dc06c273d037b4fdc1cc8ec57693895") : new RecceLayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<RecceLayoutShadowNode> getShadowNodeClass() {
        return RecceLayoutShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3145c3946457546532fe32f0125dafc", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3145c3946457546532fe32f0125dafc") : com.facebook.react.common.c.a(a.b(4), com.facebook.react.common.c.a("registrationName", "onLoadStart"), a.b(2), com.facebook.react.common.c.a("registrationName", "onLoad"), a.b(1), com.facebook.react.common.c.a("registrationName", "onError"), a.b(3), com.facebook.react.common.c.a("registrationName", "onLoadEnd"));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull @NotNull final RecceRCTRoundImageView recceRCTRoundImageView) {
        Object[] objArr = {recceRCTRoundImageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dccb5692f9f32076de743507e54fa8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dccb5692f9f32076de743507e54fa8c");
        } else if (UiThreadUtil.isOnUiThread()) {
            recceRCTRoundImageView.maybeUpdateView();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.android.recce.views.image.RecceImageManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d82bff7e8e1d7a3459ec99b1eeca8f7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d82bff7e8e1d7a3459ec99b1eeca8f7e");
                    } else {
                        recceRCTRoundImageView.maybeUpdateView();
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public void recceOnAfterUpdateTransaction(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a59d228d29f4423977e146a4648bab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a59d228d29f4423977e146a4648bab3");
        } else {
            onAfterUpdateTransaction((RecceRCTRoundImageView) view);
        }
    }
}
