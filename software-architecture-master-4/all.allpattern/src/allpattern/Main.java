package allpattern;

import abstractfactorypattern.AbstractFactoryPattern;
import adapterpattern.AdapterPattern;
import balkingpattern.BalkingPattern;
import bridgepattern.BridgePattern;
import builderpattern.BuilderPattern;
import callbackpattern.CallbackPattern;
import chainofresponsibilitypattern.ChainOfResponsibilityPattern;
import commandpattern.CommandPattern;
import compositeentitypattern.CompositeEntityPattern;
import compositepattern.CompositePattern;
import converterpattern.ConverterPattern;
import dataaccessobjectpattern.DataAccessObjectPattern;
import databuspattern.DataBusPattern;
import decoratortry.DecoratorPattern;
import delegationpattern.DelegationPattern;
import doublecheckedlockingpattern.DoubleCheckedLockingPattern;
import facadetry.FacadePattern;
import factorypattern.FactoryPattern;
import filterpattern.FilterPattern;
import fluentinterfacepattern.FluentInterfacePattern;
import flyweightpattern.FlyweightPattern;
import gamelooppattern.GameLoopPattern;
import interceptingfilterpattern.InterceptingFilterPattern;
import interpreterpattern.InterpreterPattern;
import iteratorpattern.IteratorPattern;
import mediatorpattern.MediatorPattern;
import mementopattern.MementoPattern;
import modulepattern.ModulePattern;
import monostatepattern.MonostatePattern;
import multitonpattern.MultitonPattern;
import mvcpattern.MVCPattern;
import nullobjectpattern.NullObjectPattern;
import observerattern.ObserverPattern;
import prototypepattern.PrototypePattern;
import proxytry.ProxyPattern;
import serventpattern.ServantPattern;
import singletonpattern.SingletonPattern;
import statepattern.StatePattern;
import strategypattern.StrategyPattern;
import templatemethodpattern.TemplateMethodPattern;
import tools.PrintTool;
import transferobjectpattern.TransferObjectPattern;
import typeobjectpattern.TypeObjectPattern;
import visitorpattern.VisitorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 
 * @Description: a tool class helps to add info before logs
 * @Date: Created in 20:12 2020/11/4
 * @Modified By: 
 **/
public class Main {
    private final int patternNumber = 0;
    private final List<Runnable> patternsFunc = null;
    private final List<String> patternName = null;

    /**
     * @Author: 
     * @Description: main函数，主要用于打印项目信息，然后调用showPatterns方法展示各个设计模式
     * @Param Type
     * param: args
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 18:16 2020/11/28
     * @Modified By:
     **/
    public static void main(String[] args) {


    }

    /**
     * @Author: 
     * @Description: 向Main类中注册设计模式
     * @Param Type
     * param: name
     * resume: 设计模式名称
     * param: method
     * resume: 设计模式的接口方法
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 12:30 2020/11/25
     * @Modified By:
     **/
    public void registerPattern(String name, Runnable method) {



    }

    /**
     * @Author: 
     * @Description: 构造函数，需要在这里注册每一个设计模式,如需测试请使用下面各模式的接口，接口调用使用了lambda表达式
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return:
     * @resume:
     * @Date: 12:35 2020/11/25
     * @Modified By:
     **/
    public Main() {



    }

    /**
     * @Author: 
     * @Description: 打印项目说明
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 18:15 2020/11/28
     * @Modified By:
     **/
    public void showHeadbar() {
        System.out.println("all desgin patterns we learned and realized are as follow:");
		//....
        System.out.println("\nnumber before the pattern name means the code of the pattern.");
        System.out.println("We make every pattern a interface for you to do the test conveniently.\n");
    }

    /**
     * @Author: 
     * @Description: 获取测试者输入，并展示相应模式
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 18:15 2020/11/28
     * @Modified By:
     **/
    public void showPatterns() {

	}
}
