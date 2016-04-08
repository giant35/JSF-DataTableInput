/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.yek.testdtinput;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

/**
 *
 * @author sihai
 */
@ManagedBean(name = "c") 
@ViewScoped
public class InputController {

    /**
     * Creates a new instance of InputController
     */
    public InputController() {
        LOG.warning("InputController()");
        list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            EditItem item = new EditItem();
            list.add(item);
        }
    }
    private static final Logger LOG = Logger.getLogger(InputController.class.getName());

    private List<EditItem> list;

    public List<EditItem> getList() {
        LOG.warning("getList() return size:"+list.size());
        return list;
    }

    public void setList(List<EditItem> list) {
        this.list = list;
    }

    
    public void save(){
        LOG.warning("save()");
        for(EditItem item : list){
            System.out.println(item);
        }
    }
}
