package com.dianping.shield.debug;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.AgentsRegisterMapping;
import com.dianping.shield.bridge.ShieldDataStorage;
import com.dianping.shield.env.ShieldEnvironment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DebugFragment extends Fragment {
    public static final String FILE_NAME = "MergeSharedPerferance";
    public static final String NEED_BOUNDS_KEY = "NeedBounds";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<FragmentInfoModule> fragmentInfoModules;

    public void setDataStorage(ShieldDataStorage shieldDataStorage) {
        Object[] objArr = {shieldDataStorage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d964063f397713c69fb4a06025dfc66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d964063f397713c69fb4a06025dfc66b");
        } else if (shieldDataStorage != null) {
            ShieldEnvironment.INSTANCE.setDataStorage(shieldDataStorage);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da5534ea8ee79f9a1720918417aa12b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da5534ea8ee79f9a1720918417aa12b3");
            return;
        }
        super.onCreate(bundle);
        if ((getActivity() instanceof AppCompatActivity) && ((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().c();
        }
        this.fragmentInfoModules = new ArrayList();
        FragmentInfoModule fragmentInfoModule = new FragmentInfoModule();
        fragmentInfoModule.fragmentName = "进入模块化配置2.0Debug页面";
        fragmentInfoModule.onClickListener = new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "11f495caca55f9c62eabb3c48227ea17", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "11f495caca55f9c62eabb3c48227ea17");
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("dianping://eunomiadebug"));
                    intent.setPackage(DebugFragment.this.getContext().getPackageName());
                    DebugFragment.this.startActivity(intent);
                } catch (Exception unused) {
                    new a(DebugFragment.this.getActivity(), "敬请期待...", -1).e(17).a();
                }
            }
        };
        this.fragmentInfoModules.add(fragmentInfoModule);
        FragmentInfoModule fragmentInfoModule2 = new FragmentInfoModule();
        Bundle bundle2 = new Bundle();
        bundle2.putString("agentmappath", AgentsRegisterMapping.class.getCanonicalName());
        fragmentInfoModule2.bundle = bundle2;
        fragmentInfoModule2.fragment = new DebugAgentConfigListFragment();
        fragmentInfoModule2.fragmentName = "进入模块配置Debug面板";
        fragmentInfoModule2.showFragmentTag = "DebugAgentConfigListFragment";
        this.fragmentInfoModules.add(fragmentInfoModule2);
        FragmentInfoModule fragmentInfoModule3 = new FragmentInfoModule();
        fragmentInfoModule3.view = makeSwitch("展示模块边界", needBounds(), new CompoundButton.OnCheckedChangeListener() { // from class: com.dianping.shield.debug.DebugFragment.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr2 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a55bb3c439ffc243e6a306067e98f112", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a55bb3c439ffc243e6a306067e98f112");
                    return;
                }
                SharedPreferences.Editor edit = ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(DebugFragment.this.getContext().getApplicationContext(), "MergeSharedPerferance").edit();
                edit.putBoolean("NeedBounds", z);
                ShieldEnvironment.INSTANCE.setNeedBounds(Boolean.valueOf(z));
                edit.commit();
            }
        });
        this.fragmentInfoModules.add(fragmentInfoModule3);
        FragmentInfoModule fragmentInfoModule4 = new FragmentInfoModule();
        fragmentInfoModule4.view = makeSwitch("开启WhiteBoard、节点调试 \n (页面连续6次点击)", needDebugPanel(), new CompoundButton.OnCheckedChangeListener() { // from class: com.dianping.shield.debug.DebugFragment.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr2 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "18f23ff463ea492628f5f90e60ed058d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "18f23ff463ea492628f5f90e60ed058d");
                    return;
                }
                DebugSettings.IS_DEBUGPANEL_SHOW = z;
                if (z) {
                    return;
                }
                WhiteBoardDataStoreSnapshot.getSingleton().releaseWhiteBoard();
                NodeListDataStoreSnapshot.getSingleton().releaseNodeListDataSource();
            }
        });
        this.fragmentInfoModules.add(fragmentInfoModule4);
        FragmentInfoModule fragmentInfoModule5 = new FragmentInfoModule();
        fragmentInfoModule5.fragment = new DebugLocalRegisterAgentConfigFragment();
        fragmentInfoModule5.fragmentName = "进入模块本地配置列表";
        fragmentInfoModule5.showFragmentTag = "DebugLocalRegisterAgentConfigFragment";
        this.fragmentInfoModules.add(fragmentInfoModule5);
        FragmentInfoModule fragmentInfoModule6 = new FragmentInfoModule();
        fragmentInfoModule6.fragmentName = "进入模块性能监控页面";
        fragmentInfoModule6.onClickListener = new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugFragment.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0a6ea9b3ab26e6ef8385421d2bb12706", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0a6ea9b3ab26e6ef8385421d2bb12706");
                    return;
                }
                Intent intent = new Intent("com.dianping.shield.debugpanel.performance");
                intent.setPackage(DebugFragment.this.getContext().getPackageName());
                DebugFragment.this.startActivity(intent);
            }
        };
        this.fragmentInfoModules.add(fragmentInfoModule6);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "127bb94f0e42c8680473af54ee2a4c9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "127bb94f0e42c8680473af54ee2a4c9d");
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), 17170443));
        DebugNabviBarView debugNabviBarView = new DebugNabviBarView(getContext());
        debugNabviBarView.setTitleView("模块化框架调试列表");
        linearLayout.addView(debugNabviBarView, new LinearLayout.LayoutParams(-1, -2));
        debugNabviBarView.setOnBackClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugFragment.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2a9b73922aa3fddc5e3d1f9a79906538", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2a9b73922aa3fddc5e3d1f9a79906538");
                } else {
                    DebugFragment.this.getActivity().finish();
                }
            }
        });
        View view = new View(getContext());
        view.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.divider_line_gray));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, aq.a(getContext(), 1.0f)));
        for (final FragmentInfoModule fragmentInfoModule : this.fragmentInfoModules) {
            if (fragmentInfoModule.view == null) {
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugFragment.6
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Object[] objArr2 = {view2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dc0fe8329a1d42dc99539d5c8a458759", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dc0fe8329a1d42dc99539d5c8a458759");
                        } else if (fragmentInfoModule.fragment != null) {
                            DebugFragmentUtils.showFragment((AppCompatActivity) null, DebugFragment.this, fragmentInfoModule.fragment, fragmentInfoModule.showFragmentTag, fragmentInfoModule.bundle);
                        }
                    }
                };
                if (fragmentInfoModule.onClickListener == null) {
                    fragmentInfoModule.onClickListener = onClickListener;
                }
                TextView makeTvBtn = makeTvBtn(fragmentInfoModule.fragmentName, fragmentInfoModule.onClickListener);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.leftMargin = aq.a(getContext(), 10.0f);
                linearLayout.addView(makeTvBtn, layoutParams);
            } else {
                linearLayout.addView(fragmentInfoModule.view, new LinearLayout.LayoutParams(-1, -2));
            }
            View view2 = new View(getContext());
            view2.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.divider_line_gray));
            linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
        }
        return linearLayout;
    }

    private TextView makeTvBtn(String str, View.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e0f8b66090bb176a4b8370211aa626b", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e0f8b66090bb176a4b8370211aa626b");
        }
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(18.0f);
        textView.setBackgroundColor(-1);
        textView.setTextColor(ContextCompat.getColor(getContext(), R.color.gray_light_333333));
        textView.setGravity(19);
        textView.setPadding(30, 30, 30, 30);
        textView.setOnClickListener(onClickListener);
        return textView;
    }

    private View makeSwitch(String str, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), onCheckedChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d09338629a11683695f5f9a979c8729a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d09338629a11683695f5f9a979c8729a");
        }
        LinearLayout linearLayout = new LinearLayout(getContext().getApplicationContext());
        linearLayout.setPadding(30, 40, 30, 40);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(getContext().getApplicationContext());
        textView.setText(str);
        textView.setTextSize(18.0f);
        textView.setTextColor(ContextCompat.getColor(getContext(), R.color.gray_light_333333));
        textView.setGravity(19);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.leftMargin = aq.a(getContext(), 10.0f);
        linearLayout.addView(textView, layoutParams);
        Switch r12 = new Switch(getContext().getApplicationContext());
        r12.setChecked(z);
        r12.setOnCheckedChangeListener(onCheckedChangeListener);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = aq.a(getContext(), 10.0f);
        linearLayout.addView(r12, layoutParams2);
        return linearLayout;
    }

    public boolean needBounds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02af6cfd701bca90c2428ae21cddaa75", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02af6cfd701bca90c2428ae21cddaa75")).booleanValue() : ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(getContext().getApplicationContext(), "MergeSharedPerferance").getBoolean("NeedBounds", false);
    }

    public boolean needDebugPanel() {
        return DebugSettings.IS_DEBUGPANEL_SHOW;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class FragmentInfoModule {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Bundle bundle;
        public Fragment fragment;
        public String fragmentName;
        public View.OnClickListener onClickListener;
        public String showFragmentTag;
        public View view;

        public FragmentInfoModule() {
        }
    }
}
