package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum PrimitivesModule_ProvideBooleanFactory implements Factory<Boolean> {
INSTANCE;

  @Override
  public Boolean get() {  
    Boolean provided = PrimitivesModule.provideBoolean();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Boolean> create() {  
    return INSTANCE;
  }
}

