package com.dianping.shield.debug.node;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.agentsdk.framework.r;
import com.dianping.agentsdk.sectionrecycler.section.e;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NodeListAdapter extends e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context context;
    private List<ShieldCellGroup> nodeList;
    private NodeUpdateInterface nodeUpdate;
    private int openedId;

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public Rect bottomDividerOffset(int i, int i2) {
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public Drawable getBottomDivider(int i, int i2) {
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.a
    public r getDividerInfo(int i, int i2) {
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public Drawable getSectionFooterDrawable(int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public float getSectionFooterHeight(int i) {
        return 30.0f;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public Drawable getSectionHeaderDrawable(int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public float getSectionHeaderHeight(int i) {
        return i == 0 ? 30.0f : 0.0f;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public Drawable getTopDivider(int i, int i2) {
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public boolean hasBottomDividerVerticalOffset(int i, int i2) {
        return false;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public boolean hasTopDividerVerticalOffset(int i, int i2) {
        return false;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public Rect topDividerOffset(int i, int i2) {
        return null;
    }

    public NodeListAdapter(List<ShieldCellGroup> list, Context context, NodeUpdateInterface nodeUpdateInterface) {
        super(context);
        Object[] objArr = {list, context, nodeUpdateInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12e258834bf1c87f6b86e605787519d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12e258834bf1c87f6b86e605787519d7");
            return;
        }
        this.openedId = -1;
        this.nodeList = list;
        this.context = context;
        this.nodeUpdate = nodeUpdateInterface;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1758f8f272cdec3612370a01fd9fbcfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1758f8f272cdec3612370a01fd9fbcfe");
        }
        ItemHolder itemHolder = new ItemHolder(LayoutInflater.from(this.context).inflate(R.layout.shield_nodedebug_viewcell_item, (ViewGroup) null));
        itemHolder.setIsRecyclable(false);
        return itemHolder;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public int getSectionCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5bb070f343a07296c2ef44ce7b8c601", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5bb070f343a07296c2ef44ce7b8c601")).intValue();
        }
        if (this.nodeList != null) {
            return this.nodeList.size();
        }
        return 0;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public int getRowCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52ad5a05e662ed83628bb6acbe5037f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52ad5a05e662ed83628bb6acbe5037f5")).intValue();
        }
        if (this.nodeList.get(i) == null || this.nodeList.get(i).shieldViewCells == null) {
            return 0;
        }
        return this.nodeList.get(i).shieldViewCells.size();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public void onBindViewHolder(RecyclerView.s sVar, final int i, final int i2) {
        Object[] objArr = {sVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08eb3e8f26792197b8cee7bcfa8883a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08eb3e8f26792197b8cee7bcfa8883a6");
            return;
        }
        final int itemId = (int) getItemId(i, i2);
        final boolean z = this.openedId == itemId;
        ItemHolder itemHolder = (ItemHolder) sVar;
        ShieldViewCell itemDataBySectionPosition = getItemDataBySectionPosition(i, i2);
        if (itemDataBySectionPosition != null) {
            TextView textView = itemHolder.titleView;
            textView.setText("ShieldViewCell:" + itemDataBySectionPosition.owner.getHostName());
            itemHolder.subTitleView.setText(organizSubModuleInfo(itemDataBySectionPosition));
            if (itemDataBySectionPosition.shieldSections == null || itemDataBySectionPosition.shieldSections.size() <= 0) {
                itemHolder.itemView.setBackgroundColor(Color.parseColor("#CCCCCC"));
                itemHolder.editView.setVisibility(8);
                itemHolder.expendView.setVisibility(8);
                return;
            }
            itemHolder.editView.setVisibility(0);
            itemHolder.expendView.setVisibility(0);
            itemHolder.expendView.setText(z ? "收起" : "展开");
            itemHolder.expendView.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.node.NodeListAdapter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e661e6a8af7a713e13479ed22d88f8d7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e661e6a8af7a713e13479ed22d88f8d7");
                        return;
                    }
                    NodeListAdapter.this.openedId = z ? -1 : itemId;
                    NodeListAdapter.this.notifyDataSetChanged();
                }
            });
            itemHolder.editView.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.node.NodeListAdapter.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "02297db7d261ace5519f6c74c13c2ba7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "02297db7d261ace5519f6c74c13c2ba7");
                    } else {
                        NodeListAdapter.this.ShowEditDialogFragment(i, i2, NodeListAdapter.this);
                    }
                }
            });
            Iterator<ShieldSection> it = itemDataBySectionPosition.shieldSections.iterator();
            int i3 = 1;
            while (it.hasNext()) {
                itemHolder.sectionView.addView(new SectionItemView(this.context, it.next(), i3));
                i3++;
            }
            itemHolder.sectionView.setVisibility(z ? 0 : 8);
            itemHolder.itemView.setBackgroundColor(Color.parseColor("#FFF0F5"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ShowEditDialogFragment(int i, int i2, NodeListAdapter nodeListAdapter) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), nodeListAdapter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94e248c43803cae914edad32b38f71d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94e248c43803cae914edad32b38f71d0");
        } else {
            this.nodeUpdate.showUpdateFragment(i, i2, nodeListAdapter);
        }
    }

    private String organizSubModuleInfo(ShieldViewCell shieldViewCell) {
        Object[] objArr = {shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4fc2259f891fab6e9dd5bf16141716d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4fc2259f891fab6e9dd5bf16141716d");
        }
        if (shieldViewCell == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (shieldViewCell.shieldSections != null) {
            sb.append("sectionCount:");
            sb.append(shieldViewCell.shieldSections.size() + StringUtil.SPACE);
            sb.append("shouldShow:");
            sb.append(shieldViewCell.shouldShow + StringUtil.SPACE);
            if (shieldViewCell.loadingStatus != null) {
                sb.append("loadingStatus:");
                sb.append(shieldViewCell.loadingStatus + StringUtil.SPACE);
            }
            if (shieldViewCell.loadingMoreStatus != null) {
                sb.append("loadingMoreStatus:");
                sb.append(shieldViewCell.loadingMoreStatus);
            }
        } else {
            sb.append("NoView");
        }
        return sb.toString();
    }

    private ShieldViewCell getItemDataBySectionPosition(int i, int i2) {
        ShieldCellGroup shieldCellGroup;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a15be8660aae8bdba5b4fd7d7a4efab4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewCell) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a15be8660aae8bdba5b4fd7d7a4efab4");
        }
        if (this.nodeList == null || this.nodeList.size() <= 0 || (shieldCellGroup = this.nodeList.get(i)) == null || shieldCellGroup.shieldViewCells == null) {
            return null;
        }
        return shieldCellGroup.shieldViewCells.get(i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class ItemHolder extends RecyclerView.s {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Button editView;
        private Button expendView;
        private LinearLayout sectionView;
        private TextView subTitleView;
        private TextView titleView;

        public ItemHolder(View view) {
            super(view);
            Object[] objArr = {NodeListAdapter.this, view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf3363f58678d9ddbcb61331effe6d0f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf3363f58678d9ddbcb61331effe6d0f");
                return;
            }
            this.titleView = (TextView) view.findViewById(R.id.viewcell_name);
            this.subTitleView = (TextView) view.findViewById(R.id.viewcell_info);
            this.sectionView = (LinearLayout) view.findViewById(R.id.sections_whole_view);
            this.expendView = (Button) view.findViewById(R.id.module_expend);
            this.editView = (Button) view.findViewById(R.id.module_edit);
        }
    }
}
