/**
 * 
 */
package org.connectopensource.interopgui.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.connectopensource.interopgui.controller.ListController;
import org.connectopensource.interopgui.view.OrganizationSummary;

/**
 * @author msw
 * 
 */
@ManagedBean
public class ListBean {

    List<OrganizationSummary> orgSummaries;

    public ListBean() {
        orgSummaries = new ArrayList<OrganizationSummary>();
    }

    public List<OrganizationSummary> getOrgSummaries() {
        if (orgSummaries.size() == 0) {
            orgSummaries = populateOrgSummaries();
        }
        return orgSummaries;
    }

    private List<OrganizationSummary> populateOrgSummaries() {
        ListController cont = new ListController();
        return cont.getSummaries();
    }

}
