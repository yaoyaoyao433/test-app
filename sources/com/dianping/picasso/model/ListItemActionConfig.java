package com.dianping.picasso.model;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ListItemActionConfig implements Decoding {
    public static final DecodingFactory<ListItemActionConfig> DECODER = new DecodingFactory<ListItemActionConfig>() { // from class: com.dianping.picasso.model.ListItemActionConfig.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ListItemActionConfig[] createArray(int i) {
            return new ListItemActionConfig[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ListItemActionConfig createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b6a07c15da412f923ccf6a345e05fca", RobustBitConfig.DEFAULT_VALUE) ? (ListItemActionConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b6a07c15da412f923ccf6a345e05fca") : new ListItemActionConfig();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String color;
    public String image;
    public boolean shouldCollapse;
    public String title;

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb683e2d565d9adeb62833c87b600adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb683e2d565d9adeb62833c87b600adf");
            return;
        }
        while (true) {
            int readMemberHash16 = unarchived.readMemberHash16();
            if (readMemberHash16 <= 0) {
                return;
            }
            if (readMemberHash16 == 8792) {
                this.title = unarchived.readString();
            } else if (readMemberHash16 == 12131) {
                this.color = unarchived.readString();
            } else if (readMemberHash16 == 14976) {
                this.shouldCollapse = unarchived.readBoolean();
            } else if (readMemberHash16 == 43355) {
                this.image = unarchived.readString();
            } else {
                unarchived.skipAny();
            }
        }
    }
}
