package com.sankuai.titans.offline.titans.adapter.plugin.debug;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.offline.OfflineDebugInfo;
import com.dianping.titans.offline.entity.OfflineDebugItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.services.IToastService;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OfflineDebugView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IToastService toastService;

    public OfflineDebugView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b26024b2efcb102b4a818b69c2a2e986", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b26024b2efcb102b4a818b69c2a2e986");
        }
    }

    public OfflineDebugView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd7e82706a3d67a12dc392c51195e5c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd7e82706a3d67a12dc392c51195e5c9");
        }
    }

    public OfflineDebugView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3cfd27297fab6d5434c4bccfe212dd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3cfd27297fab6d5434c4bccfe212dd9");
            return;
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        initView(context);
    }

    private void initView(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b46ccc50ef5b2b0a94417075b3b58b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b46ccc50ef5b2b0a94417075b3b58b9");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.offline_debug_view, (ViewGroup) this, true);
        ((TextView) inflate.findViewById(R.id.offline_current)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.offline.titans.adapter.plugin.debug.OfflineDebugView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e05c33280d112bc9da1a37323a33ee77", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e05c33280d112bc9da1a37323a33ee77");
                    return;
                }
                List<OfflineDebugItem> list = OfflineDebugInfo.pageOfflineList;
                if (list == null || list.size() == 0) {
                    if (OfflineDebugView.this.toastService != null) {
                        OfflineDebugView.this.toastService.showShortToast(view, context.getString(R.string.offline_not_hint));
                        return;
                    }
                    return;
                }
                new OfflineDebugDialog(OfflineDebugView.this.getContext()).show();
            }
        });
        ((TextView) inflate.findViewById(R.id.offline_global)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.offline.titans.adapter.plugin.debug.OfflineDebugView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "99793a84f2b2344c2d6c300bc053bc57", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "99793a84f2b2344c2d6c300bc053bc57");
                } else {
                    new OfflineGlobalDialog(OfflineDebugView.this.getContext()).show();
                }
            }
        });
    }

    public OfflineDebugView setToastService(IToastService iToastService) {
        this.toastService = iToastService;
        return this;
    }
}
