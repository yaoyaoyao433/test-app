package com.dianping.shield.debug;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.dianping.shield.AgentRegisterKey;
import com.dianping.shield.AgentsRegisterMapping;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DebugAgentConfigDetailFragment extends Fragment {
    private static final String DUPLICATE = "在线配置重复";
    private static final String MAPPING_ERROR = "本地映射错误";
    private static final String MAP_LOADED = "（本地映射已加载）";
    private static final String TITLE = "在线模块配置详情";
    private static final String UNNECESSARY_BLANK = "这可能是一个多余的空格，请检查在线配置";
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<AgentRegisterKey, ShieldConfigInfo> agentMap;
    private String data;
    private ListView listView;
    private PageAgentListAdapter pageAgentListAdapter;

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b811aebe87808bbead87ab697b950cbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b811aebe87808bbead87ab697b950cbf");
        }
        if ((getActivity() instanceof AppCompatActivity) && ((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().c();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return new View(getContext());
        }
        this.data = arguments.getString("data");
        this.agentMap = AgentsRegisterMapping.getInstance().getGlobalAgentMap();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        DebugNabviBarView debugNabviBarView = new DebugNabviBarView(getContext());
        if (this.agentMap != null) {
            debugNabviBarView.setTitleView("在线模块配置详情（本地映射已加载）");
        } else {
            debugNabviBarView.setTitleView(TITLE);
        }
        debugNabviBarView.setOnBackClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugAgentConfigDetailFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b7a804b4345aceb8b9f44fb61202744b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b7a804b4345aceb8b9f44fb61202744b");
                } else {
                    DebugAgentConfigDetailFragment.this.getActivity().onBackPressed();
                }
            }
        });
        linearLayout.addView(debugNabviBarView, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(getContext());
        view.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.divider_line_gray));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, 1));
        if (!TextUtils.isEmpty(this.data)) {
            this.pageAgentListAdapter = new PageAgentListAdapter(Arrays.asList(this.data.split(CommonConstant.Symbol.COMMA)));
            this.listView = new ListView(getContext());
            this.listView.setAdapter((ListAdapter) this.pageAgentListAdapter);
            linearLayout.addView(this.listView, new LinearLayout.LayoutParams(-1, -2));
            return linearLayout;
        }
        String string = arguments.getString(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER);
        TextView textView = new TextView(getContext());
        textView.setText(string);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class PageAgentListAdapter extends BaseAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<String> moduleList;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public PageAgentListAdapter(List<String> list) {
            Object[] objArr = {DebugAgentConfigDetailFragment.this, list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72c8342f06f93ff93bc04acf0029602b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72c8342f06f93ff93bc04acf0029602b");
                return;
            }
            this.moduleList = new ArrayList();
            this.moduleList.clear();
            this.moduleList.addAll(list);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb0816d70f07265edcff0da1fcabfc6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb0816d70f07265edcff0da1fcabfc6")).intValue() : this.moduleList.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9c2de52de410e9b93d945233b4f97f1", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9c2de52de410e9b93d945233b4f97f1") : this.moduleList.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d7a9242800883573732a5467a87f9d4", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d7a9242800883573732a5467a87f9d4");
            }
            if (DebugAgentConfigDetailFragment.UNNECESSARY_BLANK.equals(this.moduleList.get(i))) {
                return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shield_debug_config_item_unnecessary, viewGroup, false);
            }
            if (HiAnalyticsConstant.REPORT_VAL_SEPARATOR.equals(this.moduleList.get(i))) {
                return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shield_debug_config_item_gray, viewGroup, false);
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shield_debug_agent_config_item, viewGroup, false);
            ((TextView) inflate.findViewById(R.id.module_name)).setText(this.moduleList.get(i));
            String str = isDuplicate(i) ? DebugAgentConfigDetailFragment.DUPLICATE : null;
            if (DebugAgentConfigDetailFragment.this.agentMap != null) {
                ShieldConfigInfo agent = AgentsRegisterMapping.getInstance().getAgent(this.moduleList.get(i));
                String str2 = "";
                if (agent != null && agent.agentClass != null && !TextUtils.isEmpty(agent.agentClass.getCanonicalName())) {
                    str2 = agent.agentClass.getCanonicalName();
                } else if (agent != null && !TextUtils.isEmpty(agent.agentPath)) {
                    str2 = agent.agentPath;
                }
                if (TextUtils.isEmpty(str2)) {
                    if (TextUtils.isEmpty(str)) {
                        str = str + DebugAgentConfigDetailFragment.MAPPING_ERROR;
                    } else {
                        str = str + ",本地映射错误";
                    }
                } else {
                    TextView textView = (TextView) inflate.findViewById(R.id.agent_class);
                    textView.setVisibility(0);
                    textView.setText(str2);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                TextView textView2 = (TextView) inflate.findViewById(R.id.error_msg);
                textView2.setVisibility(0);
                textView2.setText(str);
            }
            return inflate;
        }

        private boolean isDuplicate(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb64a1ae3544f9d406584087db3f35c4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb64a1ae3544f9d406584087db3f35c4")).booleanValue();
            }
            String str = this.moduleList.get(i);
            for (int i2 = 0; i2 < i; i2++) {
                if (str.equals(this.moduleList.get(i2))) {
                    return true;
                }
            }
            return false;
        }
    }
}
