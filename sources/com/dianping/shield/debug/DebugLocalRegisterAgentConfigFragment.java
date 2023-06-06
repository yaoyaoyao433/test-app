package com.dianping.shield.debug;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.w;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.AgentRegisterKey;
import com.dianping.shield.AgentsRegisterMapping;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DebugLocalRegisterAgentConfigFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DebugLocalRegisterAgentConfigAdapter agentListAdapter;
    private HashMap<AgentRegisterKey, ShieldConfigInfo> agentMap;
    private int pageIndex;
    private final int pagecount;
    private RecyclerView recyclerView;
    private HashMap<AgentRegisterKey, ShieldConfigInfo> resultMap;
    private LinearLayout seatchLayout;
    private LinearLayout titleLayout;

    public static /* synthetic */ int access$608(DebugLocalRegisterAgentConfigFragment debugLocalRegisterAgentConfigFragment) {
        int i = debugLocalRegisterAgentConfigFragment.pageIndex;
        debugLocalRegisterAgentConfigFragment.pageIndex = i + 1;
        return i;
    }

    public DebugLocalRegisterAgentConfigFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92c667b2eb65405a8bc3f1f1ef26a05c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92c667b2eb65405a8bc3f1f1ef26a05c");
            return;
        }
        this.pagecount = 20;
        this.pageIndex = 1;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "638bfce9deb4cbb37009e19cc4cc85a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "638bfce9deb4cbb37009e19cc4cc85a8");
        }
        if ((getActivity() instanceof AppCompatActivity) && ((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().c();
        }
        View inflate = layoutInflater.inflate(R.layout.shield_debug_local_register_config_layout, viewGroup, false);
        initRecyclerview(inflate);
        initTitleBar(inflate);
        initSearchBar(inflate);
        return inflate;
    }

    private void initTitleBar(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8533b147e552e96ca2718365f16017b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8533b147e552e96ca2718365f16017b");
            return;
        }
        this.titleLayout = (LinearLayout) view.findViewById(R.id.debug_title_layout);
        view.findViewById(R.id.debug_title);
        ((ImageView) view.findViewById(R.id.debug_backBtn)).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugLocalRegisterAgentConfigFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8f16079cadf4148c882e411ddad41770", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8f16079cadf4148c882e411ddad41770");
                } else {
                    DebugLocalRegisterAgentConfigFragment.this.getActivity().onBackPressed();
                }
            }
        });
        ((TextView) view.findViewById(R.id.debug_searchBtn)).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugLocalRegisterAgentConfigFragment.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "12da390dd5e6c8052e57bcdaa0f30f0a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "12da390dd5e6c8052e57bcdaa0f30f0a");
                    return;
                }
                DebugLocalRegisterAgentConfigFragment.this.seatchLayout.setVisibility(0);
                DebugLocalRegisterAgentConfigFragment.this.titleLayout.setVisibility(8);
            }
        });
    }

    private void initSearchBar(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1388dd39cb15b8f72b84652643542622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1388dd39cb15b8f72b84652643542622");
            return;
        }
        this.resultMap = new HashMap<>();
        this.seatchLayout = (LinearLayout) view.findViewById(R.id.debug_search_layout);
        final EditText editText = (EditText) this.seatchLayout.findViewById(R.id.debug_search_edit);
        final ImageButton imageButton = (ImageButton) this.seatchLayout.findViewById(R.id.debug_clearBtn);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugLocalRegisterAgentConfigFragment.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "313fee72aa9784c668e71d31bc73179d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "313fee72aa9784c668e71d31bc73179d");
                    return;
                }
                editText.setText("");
                DebugLocalRegisterAgentConfigFragment.this.agentListAdapter.clearAgentData();
            }
        });
        ((TextView) this.seatchLayout.findViewById(R.id.debug_cancelBtn)).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugLocalRegisterAgentConfigFragment.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fe049d43cf76ff5e0e939b11682e5edc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fe049d43cf76ff5e0e939b11682e5edc");
                    return;
                }
                DebugLocalRegisterAgentConfigFragment.this.seatchLayout.setVisibility(8);
                DebugLocalRegisterAgentConfigFragment.this.titleLayout.setVisibility(0);
                DebugLocalRegisterAgentConfigFragment.this.resultMap.clear();
                editText.setText("");
                ((InputMethodManager) DebugLocalRegisterAgentConfigFragment.this.getActivity().getSystemService("input_method")).toggleSoftInput(0, 2);
                DebugLocalRegisterAgentConfigFragment.this.resetAdapter(DebugLocalRegisterAgentConfigFragment.this.agentMap);
            }
        });
        editText.addTextChangedListener(new TextWatcher() { // from class: com.dianping.shield.debug.DebugLocalRegisterAgentConfigFragment.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ec564d8ed9c505531e9ac9deb6950bb6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ec564d8ed9c505531e9ac9deb6950bb6");
                    return;
                }
                String trim = editable.toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    if (imageButton.getVisibility() != 4) {
                        imageButton.setVisibility(4);
                        DebugLocalRegisterAgentConfigFragment.this.agentListAdapter.clearAgentData();
                        return;
                    }
                    return;
                }
                imageButton.setVisibility(0);
                DebugLocalRegisterAgentConfigFragment.this.resultMap.clear();
                for (Map.Entry entry : DebugLocalRegisterAgentConfigFragment.this.agentMap.entrySet()) {
                    AgentRegisterKey agentRegisterKey = (AgentRegisterKey) entry.getKey();
                    if (agentRegisterKey.key.contains(trim)) {
                        DebugLocalRegisterAgentConfigFragment.this.resultMap.put(agentRegisterKey, entry.getValue());
                    }
                }
                DebugLocalRegisterAgentConfigFragment.this.resetAdapter(DebugLocalRegisterAgentConfigFragment.this.resultMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAdapter(HashMap<AgentRegisterKey, ShieldConfigInfo> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c450457cec1c74c8594e5c2157b02957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c450457cec1c74c8594e5c2157b02957");
            return;
        }
        this.agentListAdapter.setAgentMapData(hashMap);
        this.agentListAdapter.setPageInfo(1, 20);
    }

    private void initRecyclerview(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efc78faf05037375a6a8aaf5c7f97fde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efc78faf05037375a6a8aaf5c7f97fde");
            return;
        }
        this.recyclerView = (RecyclerView) view.findViewById(R.id.debug_recyclerview);
        if (this.recyclerView.getLayoutManager() == null) {
            this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        if (this.agentListAdapter == null) {
            this.agentListAdapter = new DebugLocalRegisterAgentConfigAdapter(getContext());
            this.agentMap = AgentsRegisterMapping.getInstance().getGlobalAgentMap();
            this.agentListAdapter.setAgentMapData(this.agentMap);
            this.agentListAdapter.setPageInfo(this.pageIndex, 20);
        }
        this.recyclerView.setAdapter(this.agentListAdapter);
        w wVar = new w(getContext(), 1);
        wVar.a(ContextCompat.getDrawable(getContext(), R.drawable.shield_debug_local_register_agent_config_divider));
        this.recyclerView.addItemDecoration(wVar);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f795e62bca77dd0d443718ac3290b29d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f795e62bca77dd0d443718ac3290b29d");
            return;
        }
        super.onActivityCreated(bundle);
        this.recyclerView.addOnScrollListener(new RecyclerView.k() { // from class: com.dianping.shield.debug.DebugLocalRegisterAgentConfigFragment.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "137ca8ad0404bd73cb58723d3d3090ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "137ca8ad0404bd73cb58723d3d3090ae");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                    return;
                }
                int findLastVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
                int itemCount = recyclerView.getLayoutManager().getItemCount();
                int size = (DebugLocalRegisterAgentConfigFragment.this.resultMap == null || DebugLocalRegisterAgentConfigFragment.this.resultMap.size() <= 0) ? DebugLocalRegisterAgentConfigFragment.this.agentMap.size() : DebugLocalRegisterAgentConfigFragment.this.resultMap.size();
                if (findLastVisibleItemPosition < itemCount - 5 || i2 <= 0 || size <= DebugLocalRegisterAgentConfigFragment.this.pageIndex * 20) {
                    return;
                }
                DebugLocalRegisterAgentConfigFragment.this.agentListAdapter.setPageInfo(DebugLocalRegisterAgentConfigFragment.this.pageIndex, 20);
                DebugLocalRegisterAgentConfigFragment.access$608(DebugLocalRegisterAgentConfigFragment.this);
                DebugLocalRegisterAgentConfigFragment.this.agentListAdapter.notifyDataSetChanged();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class DebugLocalRegisterAgentConfigAdapter extends RecyclerView.a<ViewHolder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private HashMap<AgentRegisterKey, ShieldConfigInfo> agentMap;
        private ArrayList<AgentRegisterKey> agentRegisterKeyList;
        private int currentPage;
        private Context mContext;
        private int resultCount;

        @Override // android.support.v7.widget.RecyclerView.a
        public int getItemViewType(int i) {
            return 0;
        }

        public DebugLocalRegisterAgentConfigAdapter(Context context) {
            Object[] objArr = {DebugLocalRegisterAgentConfigFragment.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dec1202a18373a7df6b0a5d0b8d5286", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dec1202a18373a7df6b0a5d0b8d5286");
            } else {
                this.mContext = context;
            }
        }

        public void setAgentMapData(HashMap<AgentRegisterKey, ShieldConfigInfo> hashMap) {
            Object[] objArr = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4bce1fe211fd11d3646f518a977095b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4bce1fe211fd11d3646f518a977095b");
                return;
            }
            this.agentMap = hashMap;
            this.agentRegisterKeyList = transAgentMapToList(hashMap);
            notifyDataSetChanged();
        }

        public void clearAgentData() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a575446b93af1c170b393e7c031538da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a575446b93af1c170b393e7c031538da");
                return;
            }
            this.agentRegisterKeyList = null;
            notifyDataSetChanged();
        }

        public void setPageInfo(int i, int i2) {
            this.currentPage = i;
            this.resultCount = i2;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d7fb3563981d81aa80a629c46d50940", RobustBitConfig.DEFAULT_VALUE)) {
                return (ViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d7fb3563981d81aa80a629c46d50940");
            }
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.shield_debug_local_register_config_itemview, (ViewGroup) null);
            ViewHolder viewHolder = new ViewHolder(inflate);
            viewHolder.extraKey = (TextView) inflate.findViewById(R.id.extra_key);
            viewHolder.extraKeyValue = (TextView) inflate.findViewById(R.id.extra_key_value);
            viewHolder.keyValue = (TextView) inflate.findViewById(R.id.key_value);
            viewHolder.moduleClassOrPath = (TextView) inflate.findViewById(R.id.module_path);
            viewHolder.moduleClassOrPathName = (TextView) inflate.findViewById(R.id.module_path_value);
            return viewHolder;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            Object[] objArr = {viewHolder, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bc128865b7870d470ad8d281c3019f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bc128865b7870d470ad8d281c3019f0");
                return;
            }
            AgentRegisterKey agentRegisterKey = this.agentRegisterKeyList.get(i);
            ShieldConfigInfo shieldConfigInfo = this.agentMap.get(agentRegisterKey);
            viewHolder.itemView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            if (!TextUtils.isEmpty(agentRegisterKey.extraKey)) {
                viewHolder.extraKeyValue.setText(agentRegisterKey.extraKey);
            } else {
                viewHolder.extraKeyValue.setVisibility(8);
                viewHolder.extraKey.setVisibility(8);
            }
            if (!TextUtils.isEmpty(agentRegisterKey.key)) {
                viewHolder.keyValue.setText(agentRegisterKey.key);
            } else {
                viewHolder.keyValue.setText(StringUtil.NULL);
            }
            if (shieldConfigInfo.agentClass != null && !TextUtils.isEmpty(shieldConfigInfo.agentClass.getCanonicalName())) {
                viewHolder.moduleClassOrPathName.setText("C");
                viewHolder.moduleClassOrPathName.setText(shieldConfigInfo.agentClass.getCanonicalName());
            } else if (TextUtils.isEmpty(shieldConfigInfo.agentPath)) {
            } else {
                viewHolder.moduleClassOrPathName.setText("P");
                viewHolder.moduleClassOrPathName.setText(shieldConfigInfo.agentPath);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edb13ef2bdb24e69b49aa412f3f8f870", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edb13ef2bdb24e69b49aa412f3f8f870")).intValue();
            }
            if (this.agentRegisterKeyList == null) {
                return 0;
            }
            if (this.currentPage * this.resultCount <= this.agentRegisterKeyList.size()) {
                return this.currentPage * this.resultCount;
            }
            return this.agentRegisterKeyList.size() - ((this.currentPage - 1) * this.resultCount);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public class ViewHolder extends RecyclerView.s {
            public static ChangeQuickRedirect changeQuickRedirect;
            public TextView extraKey;
            public TextView extraKeyValue;
            public TextView keyValue;
            public TextView moduleClassOrPath;
            public TextView moduleClassOrPathName;

            public ViewHolder(View view) {
                super(view);
            }
        }

        public ArrayList<AgentRegisterKey> transAgentMapToList(Map<AgentRegisterKey, ShieldConfigInfo> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5aada06336258bb2f63e95620756d93", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5aada06336258bb2f63e95620756d93");
            }
            ArrayList<AgentRegisterKey> arrayList = new ArrayList<>();
            for (Map.Entry<AgentRegisterKey, ShieldConfigInfo> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
            }
            return arrayList;
        }
    }
}
