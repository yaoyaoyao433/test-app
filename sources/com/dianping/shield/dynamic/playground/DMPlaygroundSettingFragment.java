package com.dianping.shield.dynamic.playground;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.ListFragment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import com.dianping.shield.bridge.ShieldDataStorage;
import com.dianping.shield.env.ShieldEnvironment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMPlaygroundSettingFragment extends ListFragment {
    public static final String PICASSO_MODULES_PLAYGROUND_MODULES = "picasso_modules_playground_modules";
    public static final String PICASSO_MODULES_PLAYGROUND_SETTINGS = "com.dianping.picassomodule.settings";
    public static final String PICASSO_MODULES_PLAYGROUND_WHITEBOARD = "picasso_modules_playground_whiteboard";
    public static final int TYPE_MODULE = 2;
    public static final int TYPE_WHITEBOARD = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<ModuleInfo> listModules;
    public List<WhiteBoardInfo> listWhiteboard;
    private FragmentInteraction listener;
    public ModuleAdapter moduleAdapter;
    private PicassoListInteraction picassoListListener;
    public int type;
    public WhiteBoardAdapter whiteBoardAdapter;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface FragmentInteraction {
        void onDetachFragment();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface PicassoListInteraction {
        void gotoPicassoList();
    }

    public DMPlaygroundSettingFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cd582944c2b51d1c1f9a8b7fc099d5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cd582944c2b51d1c1f9a8b7fc099d5a");
            return;
        }
        this.listWhiteboard = new ArrayList();
        this.listModules = new ArrayList();
    }

    public static DMPlaygroundSettingFragment newInstance(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17dcd58c510b1bdfa09f4542bb5dca15", RobustBitConfig.DEFAULT_VALUE)) {
            return (DMPlaygroundSettingFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17dcd58c510b1bdfa09f4542bb5dca15");
        }
        DMPlaygroundSettingFragment dMPlaygroundSettingFragment = new DMPlaygroundSettingFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        dMPlaygroundSettingFragment.setArguments(bundle);
        return dMPlaygroundSettingFragment;
    }

    public void setShieldDataStorage(ShieldDataStorage shieldDataStorage) {
        Object[] objArr = {shieldDataStorage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c846b41a364f64f9c4636b30f4bdb276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c846b41a364f64f9c4636b30f4bdb276");
        } else if (shieldDataStorage != null) {
            ShieldEnvironment.INSTANCE.setDataStorage(shieldDataStorage);
        }
    }

    @Override // android.support.v4.app.ListFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1653de299369b639068e2ceaa69b186b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1653de299369b639068e2ceaa69b186b");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setBackgroundColor(getResources().getColor(R.color.pm_black6));
        return onCreateView;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "664b6836a6a71f6a362ffaad5b3f04bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "664b6836a6a71f6a362ffaad5b3f04bc");
            return;
        }
        super.onAttach(context);
        if (context instanceof FragmentInteraction) {
            this.listener = (FragmentInteraction) context;
        }
        if (context instanceof PicassoListInteraction) {
            this.picassoListListener = (PicassoListInteraction) context;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6675666bef5898c4d687fdb16cd41367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6675666bef5898c4d687fdb16cd41367");
            return;
        }
        super.onDetach();
        if (this.listener != null) {
            this.listener.onDetachFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remove(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb0195a26b50d70b0cc60314f2e6ee7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb0195a26b50d70b0cc60314f2e6ee7a");
            return;
        }
        if (this.type == 1) {
            this.listWhiteboard.remove(i);
            this.whiteBoardAdapter.notifyDataSetChanged();
        } else if (this.type == 2) {
            this.listModules.remove(i);
            this.moduleAdapter.notifyDataSetChanged();
        }
        saveSettings();
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38f4270f21cc32c38e01621330e06a62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38f4270f21cc32c38e01621330e06a62");
            return;
        }
        super.onCreate(bundle);
        this.type = getArguments().getInt("type");
        if (this.type == 1) {
            this.whiteBoardAdapter = new WhiteBoardAdapter(getContext());
            setListAdapter(this.whiteBoardAdapter);
        } else if (this.type == 2) {
            this.moduleAdapter = new ModuleAdapter(getContext());
            setListAdapter(this.moduleAdapter);
        }
    }

    public void updateInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e5d460049726bea6487c2ed0efb7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e5d460049726bea6487c2ed0efb7da");
        } else if (this.type == 1) {
            initWhiteboard();
            this.whiteBoardAdapter.notifyDataSetChanged();
        } else if (this.type == 2) {
            initModules();
            this.moduleAdapter.notifyDataSetChanged();
        }
    }

    private void initWhiteboard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cba61f63a0df8e3216876bc00b5bae8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cba61f63a0df8e3216876bc00b5bae8f");
            return;
        }
        List<String> asList = Arrays.asList(ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(getContext().getApplicationContext(), PICASSO_MODULES_PLAYGROUND_SETTINGS, 4).getString(PICASSO_MODULES_PLAYGROUND_WHITEBOARD, "").split(CommonConstant.Symbol.COMMA));
        this.listWhiteboard = new ArrayList();
        for (String str : asList) {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("/");
                if (split.length == 2) {
                    this.listWhiteboard.add(new WhiteBoardInfo(split[0], split[1]));
                } else if (split.length == 1) {
                    this.listWhiteboard.add(new WhiteBoardInfo(split[0], ""));
                }
            }
        }
    }

    private void initModules() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c825c094d4ddc674fa307e1cb53186c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c825c094d4ddc674fa307e1cb53186c");
            return;
        }
        List<String> asList = Arrays.asList(ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(getContext().getApplicationContext(), PICASSO_MODULES_PLAYGROUND_SETTINGS).getString(PICASSO_MODULES_PLAYGROUND_MODULES, "").split(CommonConstant.Symbol.COMMA));
        this.listModules = new ArrayList();
        for (String str : asList) {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("/");
                if (split.length == 2) {
                    this.listModules.add(new ModuleInfo(split[0], split[1]));
                } else if (split.length == 1) {
                    this.listModules.add(new ModuleInfo("", split[0]));
                } else if (split.length == 3) {
                    List<ModuleInfo> list = this.listModules;
                    list.add(new ModuleInfo(split[0] + "/" + split[1], split[2]));
                }
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd18d8a0fc23c92d5cb39bda1fe27aca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd18d8a0fc23c92d5cb39bda1fe27aca");
            return;
        }
        super.onPause();
        saveSettings();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class WhiteBoardInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String key;
        public String value;

        public WhiteBoardInfo(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91469b3f4b07308d32d9a15251c06bc0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91469b3f4b07308d32d9a15251c06bc0");
                return;
            }
            this.key = str;
            this.value = str2;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5dbb5c549628ff65fe342563ade3a13", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5dbb5c549628ff65fe342563ade3a13");
            }
            if (this.key == null) {
                this.key = "";
            }
            if (this.value == null) {
                this.value = "";
            }
            return this.key + "/" + this.value;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ModuleInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String module;
        public String project;

        public ModuleInfo(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9f68e461f535f446b17663fd3acb572", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9f68e461f535f446b17663fd3acb572");
                return;
            }
            this.project = str;
            this.module = str2;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b5927004c15a12917d92d6a360e18e6", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b5927004c15a12917d92d6a360e18e6");
            }
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.project)) {
                sb.append(this.project);
            }
            sb.append("/");
            if (!TextUtils.isEmpty(this.module)) {
                sb.append(this.module);
            }
            return sb.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class WBViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public EditText editKey;
        public EditText editValue;
        public ImageView imageDelete;

        public WBViewHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class WhiteBoardAdapter extends BaseAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        private LayoutInflater mInflater;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public WhiteBoardAdapter(Context context) {
            Object[] objArr = {DMPlaygroundSettingFragment.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a48b6142a1c8980da17f93846e28be9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a48b6142a1c8980da17f93846e28be9");
                return;
            }
            this.mInflater = null;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "444233a3e9667967ee65a5f37f162be4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "444233a3e9667967ee65a5f37f162be4")).intValue() : DMPlaygroundSettingFragment.this.listWhiteboard.size();
        }

        public void addNewItem() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f5b71b3d6997c0468381db50ade42b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f5b71b3d6997c0468381db50ade42b4");
            } else {
                DMPlaygroundSettingFragment.this.listWhiteboard.add(new WhiteBoardInfo("", ""));
            }
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10de033c559b87e681f6caaac3eb7b38", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10de033c559b87e681f6caaac3eb7b38") : DMPlaygroundSettingFragment.this.listWhiteboard.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            View view2;
            WBViewHolder wBViewHolder;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b36469a7c4bcfa6075dd07443bf991b9", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b36469a7c4bcfa6075dd07443bf991b9");
            }
            if (view == null) {
                wBViewHolder = new WBViewHolder();
                view2 = this.mInflater.inflate(R.layout.pm_whiteboard_item, (ViewGroup) null);
                wBViewHolder.editValue = (EditText) view2.findViewById(R.id.value);
                wBViewHolder.editKey = (EditText) view2.findViewById(R.id.key);
                wBViewHolder.imageDelete = (ImageView) view2.findViewById(R.id.remove);
                view2.setTag(wBViewHolder);
            } else {
                view2 = view;
                wBViewHolder = (WBViewHolder) view.getTag();
            }
            if (wBViewHolder.editKey.getTag() instanceof TextWatcher) {
                wBViewHolder.editKey.removeTextChangedListener((TextWatcher) wBViewHolder.editKey.getTag());
            }
            wBViewHolder.editKey.setText(DMPlaygroundSettingFragment.this.listWhiteboard.get(i).key);
            TextWatcher textWatcher = new TextWatcher() { // from class: com.dianping.shield.dynamic.playground.DMPlaygroundSettingFragment.WhiteBoardAdapter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    Object[] objArr2 = {editable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a43bab611fa863df86bce56751ad651", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a43bab611fa863df86bce56751ad651");
                    } else {
                        DMPlaygroundSettingFragment.this.listWhiteboard.get(i).key = editable.toString();
                    }
                }
            };
            wBViewHolder.editKey.addTextChangedListener(textWatcher);
            wBViewHolder.editKey.setTag(textWatcher);
            wBViewHolder.imageDelete.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.dynamic.playground.DMPlaygroundSettingFragment.WhiteBoardAdapter.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    Object[] objArr2 = {view3};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db046a1dc8bb43cd2cc896e040624a6f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db046a1dc8bb43cd2cc896e040624a6f");
                    } else {
                        DMPlaygroundSettingFragment.this.remove(i);
                    }
                }
            });
            if (wBViewHolder.editValue.getTag() instanceof TextWatcher) {
                wBViewHolder.editValue.removeTextChangedListener((TextWatcher) wBViewHolder.editValue.getTag());
            }
            wBViewHolder.editValue.setText(DMPlaygroundSettingFragment.this.listWhiteboard.get(i).value);
            TextWatcher textWatcher2 = new TextWatcher() { // from class: com.dianping.shield.dynamic.playground.DMPlaygroundSettingFragment.WhiteBoardAdapter.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    Object[] objArr2 = {editable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ea8d6d019ba959bf300f2917fcdce65c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ea8d6d019ba959bf300f2917fcdce65c");
                    } else {
                        DMPlaygroundSettingFragment.this.listWhiteboard.get(i).value = editable.toString();
                    }
                }
            };
            wBViewHolder.editValue.addTextChangedListener(textWatcher2);
            wBViewHolder.editValue.setTag(textWatcher2);
            return view2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class ModuleViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public EditText editModule;
        public EditText editProject;
        public ImageView imageAdd;
        public ImageView imageDelete;

        public ModuleViewHolder() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class ModuleAdapter extends BaseAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        private LayoutInflater mInflater;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public ModuleAdapter(Context context) {
            Object[] objArr = {DMPlaygroundSettingFragment.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8763a4c1b9f64903bf653c4e76bfff30", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8763a4c1b9f64903bf653c4e76bfff30");
                return;
            }
            this.mInflater = null;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bc8bd9153963331c849411c80964001", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bc8bd9153963331c849411c80964001")).intValue() : DMPlaygroundSettingFragment.this.listModules.size();
        }

        public void addNewItem() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ba15bcd42498f2e317dcf8f2e5dcf54", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ba15bcd42498f2e317dcf8f2e5dcf54");
            } else {
                DMPlaygroundSettingFragment.this.listModules.add(new ModuleInfo("", ""));
            }
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df13a3c5f659c3a00057b61cc8d1a815", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df13a3c5f659c3a00057b61cc8d1a815") : DMPlaygroundSettingFragment.this.listModules.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            View view2;
            ModuleViewHolder moduleViewHolder;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7272cd5d0410c0aecd1a19596397174b", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7272cd5d0410c0aecd1a19596397174b");
            }
            if (view == null) {
                moduleViewHolder = new ModuleViewHolder();
                view2 = this.mInflater.inflate(R.layout.pm_module_item, (ViewGroup) null);
                moduleViewHolder.editModule = (EditText) view2.findViewById(R.id.module);
                moduleViewHolder.editProject = (EditText) view2.findViewById(R.id.project);
                moduleViewHolder.imageDelete = (ImageView) view2.findViewById(R.id.remove);
                moduleViewHolder.imageAdd = (ImageView) view2.findViewById(R.id.add);
                view2.setTag(moduleViewHolder);
            } else {
                view2 = view;
                moduleViewHolder = (ModuleViewHolder) view.getTag();
            }
            if (moduleViewHolder.editProject.getTag() instanceof TextWatcher) {
                moduleViewHolder.editProject.removeTextChangedListener((TextWatcher) moduleViewHolder.editProject.getTag());
            }
            moduleViewHolder.editProject.setText(DMPlaygroundSettingFragment.this.listModules.get(i).project);
            TextWatcher textWatcher = new TextWatcher() { // from class: com.dianping.shield.dynamic.playground.DMPlaygroundSettingFragment.ModuleAdapter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    Object[] objArr2 = {editable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b16d4c6a8c088145a50f087021888515", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b16d4c6a8c088145a50f087021888515");
                    } else {
                        DMPlaygroundSettingFragment.this.listModules.get(i).project = editable.toString();
                    }
                }
            };
            moduleViewHolder.editProject.addTextChangedListener(textWatcher);
            moduleViewHolder.editProject.setTag(textWatcher);
            if (moduleViewHolder.editModule.getTag() instanceof TextWatcher) {
                moduleViewHolder.editModule.removeTextChangedListener((TextWatcher) moduleViewHolder.editModule.getTag());
            }
            moduleViewHolder.editModule.setText(DMPlaygroundSettingFragment.this.listModules.get(i).module);
            TextWatcher textWatcher2 = new TextWatcher() { // from class: com.dianping.shield.dynamic.playground.DMPlaygroundSettingFragment.ModuleAdapter.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    Object[] objArr2 = {editable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf30b3eebb7b8b33f355a612226bc69b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf30b3eebb7b8b33f355a612226bc69b");
                    } else {
                        DMPlaygroundSettingFragment.this.listModules.get(i).module = editable.toString();
                    }
                }
            };
            moduleViewHolder.editModule.addTextChangedListener(textWatcher2);
            moduleViewHolder.editModule.setTag(textWatcher2);
            moduleViewHolder.imageDelete.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.dynamic.playground.DMPlaygroundSettingFragment.ModuleAdapter.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    Object[] objArr2 = {view3};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "415e9ca8ad332b05ab8a9567aa457061", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "415e9ca8ad332b05ab8a9567aa457061");
                    } else {
                        DMPlaygroundSettingFragment.this.remove(i);
                    }
                }
            });
            moduleViewHolder.imageAdd.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.dynamic.playground.DMPlaygroundSettingFragment.ModuleAdapter.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    Object[] objArr2 = {view3};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b4937574cdd273771491437e6d394517", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b4937574cdd273771491437e6d394517");
                    } else if (DMPlaygroundSettingFragment.this.picassoListListener != null) {
                        DMPlaygroundSettingFragment.this.picassoListListener.gotoPicassoList();
                    }
                }
            });
            return view2;
        }
    }

    public void addNewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54a18daeccc4ffc750b4d133fd8f5779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54a18daeccc4ffc750b4d133fd8f5779");
        } else if (this.type == 1) {
            this.whiteBoardAdapter.addNewItem();
            this.whiteBoardAdapter.notifyDataSetChanged();
        } else if (this.type == 2) {
            this.moduleAdapter.addNewItem();
            this.moduleAdapter.notifyDataSetChanged();
        }
    }

    public void saveSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31101dff714832466dafcf30ed369d12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31101dff714832466dafcf30ed369d12");
            return;
        }
        SharedPreferences.Editor edit = ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(getContext().getApplicationContext(), PICASSO_MODULES_PLAYGROUND_SETTINGS).edit();
        if (this.type == 1) {
            edit.putString(PICASSO_MODULES_PLAYGROUND_WHITEBOARD, listToString(this.listWhiteboard, ','));
        } else if (this.type == 2) {
            edit.putString(PICASSO_MODULES_PLAYGROUND_MODULES, listToString(this.listModules, ','));
        }
        edit.apply();
    }

    public String listToString(List list, char c) {
        Object[] objArr = {list, Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d310ba803a5f9e7713e0d68fd842cd6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d310ba803a5f9e7713e0d68fd842cd6a");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            sb.append(c);
        }
        return list.isEmpty() ? "" : sb.toString().substring(0, sb.toString().length() - 1);
    }
}
