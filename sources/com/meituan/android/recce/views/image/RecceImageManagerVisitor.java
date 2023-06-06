package com.meituan.android.recce.views.image;

import android.widget.ImageView;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.uimanager.w;
import com.meituan.android.recce.mrn.uimanager.RecceLayoutShadowNode;
import com.meituan.android.recce.mrn.uimanager.f;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceImageManagerVisitor extends f<RecceRCTRoundImageView, RecceLayoutShadowNode, RecceImageManager> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceImageManagerVisitor(RecceImageManager recceImageManager, RecceRCTRoundImageView recceRCTRoundImageView) {
        Object[] objArr = {recceImageManager, recceRCTRoundImageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c1abf5b2d9e70795816530ac5d6d154", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c1abf5b2d9e70795816530ac5d6d154");
            return;
        }
        this.viewManager = recceImageManager;
        this.view = recceRCTRoundImageView;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitSource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7d6b54beb8f7ff71f7b48cd368b7707", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7d6b54beb8f7ff71f7b48cd368b7707");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(JavaOnlyMap.of(Constants.TRAFFIC_URI, str, "width", Float.valueOf(0.0f), "height", Float.valueOf(0.0f)));
        ((RecceRCTRoundImageView) this.view).setSource(JavaOnlyArray.from(arrayList));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitHeight(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6ad2a435d4a5094f2c00a17d9515879", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6ad2a435d4a5094f2c00a17d9515879");
        }
        if (z) {
            ((RecceRCTRoundImageView) this.view).setHeight(-1.0f);
            return null;
        }
        ((RecceRCTRoundImageView) this.view).setHeight(w.a(f));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitWidth(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e81c8ba6afd65b7932780e9c179f1fcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e81c8ba6afd65b7932780e9c179f1fcc");
        }
        if (z) {
            ((RecceRCTRoundImageView) this.view).setWidth(-1.0f);
            return null;
        }
        ((RecceRCTRoundImageView) this.view).setWidth(w.a(f));
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitResizeMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3719d398c79b0352c1093cd4bca23148", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3719d398c79b0352c1093cd4bca23148");
        }
        ((RecceRCTRoundImageView) this.view).setScaleType(toScaleType(i));
        return null;
    }

    public static ImageView.ScaleType toScaleType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97b6ab8967d9e62d7d1ce1129c322a81", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageView.ScaleType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97b6ab8967d9e62d7d1ce1129c322a81");
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 7) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }
}
