package teams;

import javax.ws.rs.core.Application;
import java.util.LinkedHashSet;
import java.util.Set;

public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new LinkedHashSet<Class<?>>();
        resources.add(MsgResource.class);
        return resources;
    }
}
