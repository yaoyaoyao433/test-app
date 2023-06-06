package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Dialog;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PreviewFragment extends PayBaseFragment implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private String b;
    private int c;

    public static PreviewFragment a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c61333359ed88a6108390d2c6d142ced", RobustBitConfig.DEFAULT_VALUE)) {
            return (PreviewFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c61333359ed88a6108390d2c6d142ced");
        }
        PreviewFragment previewFragment = new PreviewFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("cardType", i);
        bundle.putString("path", str);
        previewFragment.setArguments(bundle);
        return previewFragment;
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df4e057399e73e8973608181ec114b44", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df4e057399e73e8973608181ec114b44") : layoutInflater.inflate(R.layout.identifycard_recognizer_fragment_capture_preview, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d59edc44e3a272c006d18a6783c4d00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d59edc44e3a272c006d18a6783c4d00");
            return;
        }
        super.onViewCreated(view, bundle);
        Point point = new Point();
        if (getActivity() != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                getActivity().getWindowManager().getDefaultDisplay().getRealSize(point);
            } else {
                getActivity().getWindowManager().getDefaultDisplay().getSize(point);
            }
        }
        if (getArguments() != null) {
            this.b = getArguments().getString("path");
            this.c = getArguments().getInt("cardType");
        }
        if (TextUtils.isEmpty(this.b)) {
            if (getActivity() != null) {
                getActivity().finish();
                return;
            }
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.img);
        ((ImageView) view.findViewById(R.id.img_back)).setOnClickListener(this);
        ((TextView) view.findViewById(R.id.txt_retry)).setOnClickListener(this);
        ((TextView) view.findViewById(R.id.txt_confirm)).setOnClickListener(this);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(this.b, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i > point.x || i2 > point.y) {
            float f = i;
            float f2 = i2;
            float max = Math.max(f / point.x, f2 / point.y);
            i = (int) (f / max);
            i2 = (int) (f2 / max);
        }
        com.meituan.android.paybase.config.a.d().r().a(this.b).a(i, i2).a().a(imageView);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "945db14b1ac612f8959b93f2cdde74f6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "945db14b1ac612f8959b93f2cdde74f6");
        } else if (view.getId() == R.id.img_back) {
            b();
        } else if (view.getId() == R.id.txt_retry) {
            com.meituan.android.paybase.common.analyse.a.a("b_u465aid0", new a.c().a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("needHold", com.meituan.android.identifycardrecognizer.utils.b.c).b);
            if (getActivity() != null) {
                ((com.meituan.android.identifycardrecognizer.g) getActivity()).b(this.c);
            }
        } else if (view.getId() == R.id.txt_confirm) {
            com.meituan.android.paybase.common.analyse.a.a("b_7ik8g10c", new a.c().a("bizID", com.meituan.android.identifycardrecognizer.utils.b.a()).a("needHold", com.meituan.android.identifycardrecognizer.utils.b.c).b);
            if (getActivity() != null) {
                ((com.meituan.android.identifycardrecognizer.g) getActivity()).a(this.c);
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4bf026459d9b9544c366198fcc6590", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4bf026459d9b9544c366198fcc6590");
        } else if (this.c != 2) {
            new PayDialog.a(getActivity()).c("确认要离开吗？").a(IPaymentManager.NO_ACTION, i.a()).b("确认", j.a(this)).b(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
        } else {
            new PayDialog.a(getActivity()).c("确认要离开吗？").a(IPaymentManager.NO_ACTION, k.a()).b("确认", l.a(this)).b(com.meituan.android.identifycardrecognizer.utils.a.b).a().show();
        }
    }

    public static /* synthetic */ void b(PreviewFragment previewFragment, Dialog dialog) {
        Object[] objArr = {previewFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d90dfa754fdf7f582c1a8fddb714bda2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d90dfa754fdf7f582c1a8fddb714bda2");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a(previewFragment.d(), "点击确认返回身份证示范", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
        dialog.dismiss();
        if (previewFragment.getActivity() != null) {
            previewFragment.getActivity().finish();
        }
    }

    public static /* synthetic */ void a(PreviewFragment previewFragment, Dialog dialog) {
        Object[] objArr = {previewFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbf0b7f1d124e3f46b25abecadd58d18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbf0b7f1d124e3f46b25abecadd58d18");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a(previewFragment.d(), "点击确认返回手持示范", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
        dialog.dismiss();
        if (previewFragment.getActivity() != null) {
            previewFragment.getActivity().finish();
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a9a988412b54fffcd89864c0d3b289f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a9a988412b54fffcd89864c0d3b289f")).booleanValue();
        }
        b();
        HashMap hashMap = new HashMap();
        hashMap.put("pageInfo", "PreviewFragment");
        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_backfrompage_sc", hashMap);
        return true;
    }
}
