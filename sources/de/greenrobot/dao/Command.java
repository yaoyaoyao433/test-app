package de.greenrobot.dao;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Command {
    public AbstractDao<?, ?> dao;
    public Object data;
    public CommandType type;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum CommandType {
        Insert,
        InsertInTx,
        AndSoOn;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CommandType[] valuesCustom() {
            CommandType[] valuesCustom = values();
            int length = valuesCustom.length;
            CommandType[] commandTypeArr = new CommandType[length];
            System.arraycopy(valuesCustom, 0, commandTypeArr, 0, length);
            return commandTypeArr;
        }
    }

    public Command(CommandType commandType, AbstractDao<?, ?> abstractDao, Object obj) {
        this.type = commandType;
        this.dao = abstractDao;
        this.data = obj;
    }
}
