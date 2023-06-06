package com.dianping.picasso.view.command;

import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CommandValue extends Value {
    public static ChangeQuickRedirect changeQuickRedirect;

    public CommandValue(Value value) {
        Object[] objArr = {value};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e081cbc575ef0b538074f4d931f96f82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e081cbc575ef0b538074f4d931f96f82");
        } else if (value == null || value.getUnarchived() == null || value.getUnarchived().rawData() == null || value.getUnarchived().rawData().length == 0 || value.isNULL()) {
            this.unarchived = new CommandUnarchived(new byte[]{78});
        } else {
            this.unarchived = new CommandUnarchived(value.getUnarchived().rawData());
        }
    }

    public BaseViewCommandModel[] array(DecodingFactory[] decodingFactoryArr) throws ArchiveException {
        Object[] objArr = {decodingFactoryArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0c0b765829a5045aef199255e2361ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseViewCommandModel[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0c0b765829a5045aef199255e2361ff");
        }
        this.unarchived.rewind();
        return ((CommandUnarchived) this.unarchived).readArray(decodingFactoryArr);
    }
}
