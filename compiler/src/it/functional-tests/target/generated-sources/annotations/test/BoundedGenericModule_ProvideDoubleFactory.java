package test;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BoundedGenericModule_ProvideDoubleFactory implements Factory<Double> {
  private final BoundedGenericModule module;

  public BoundedGenericModule_ProvideDoubleFactory(BoundedGenericModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Double get() {  
    Double provided = module.provideDouble();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Double> create(BoundedGenericModule module) {  
    return new BoundedGenericModule_ProvideDoubleFactory(module);
  }
}

